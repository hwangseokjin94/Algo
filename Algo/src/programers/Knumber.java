package programers;

import java.util.*;

public class Knumber {

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); //�迭�� ���۰� �������ϰ� �����ϴ� �޼ҵ�
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
		}
		for(int a  :answer){
			
			System.out.println(a);
		}
		return answer;
	}

	public static void main(String[] args) {
			int[] array = {1, 5, 2, 6, 3, 7, 4};
			int[][] commands = {{2, 5, 3},
								{4, 4, 1},
								{1, 7, 3}};
			
		solution(array, commands);
	}
}
