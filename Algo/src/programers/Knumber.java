package programers;

import java.util.*;

public class Knumber {

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]); //배열의 시작과 끝을정하고 복사하는 메소드
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
