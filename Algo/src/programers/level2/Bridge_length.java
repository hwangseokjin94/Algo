package programers.level2;

import java.util.LinkedList;
import java.util.Queue;

/*
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 //트럭은 1초에 1만큼움직
 bridge_length	weight	truck_weights	return
	2			10			[7,4,5,6]	8
	100			100			[10]		101
	100			100		[10,10,10,10,10,10,10,10,10,10]	110
  */
public class Bridge_length {
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int sumWeight = 0;
		int answer = 0;// 시간초

		LinkedList<Integer> qu = new LinkedList<>();
		for (int w : truck_weights) {

			while (true) {
				if (qu.isEmpty()) {
					qu.offer(w);
					sumWeight += w;
					answer++;
					break;
				} else if (qu.size() == bridge_length) {
					sumWeight -= qu.poll();
				} else {
					if (sumWeight + w > weight) {
						qu.offer(0);
						answer++;
					} else {
						qu.offer(w);
						sumWeight += w;
						answer++;
						break;

					}
				}
			} // while

		} // for
		System.out.println(answer);
		System.out.println(bridge_length);
		return answer+bridge_length;
	}

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6 };

		solution(bridge_length, weight, truck_weights);
		
	}
}
