package programers;

import java.util.Scanner;

public class Contry124 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solution(n);

	}

	public static String solution(int n) {
		String answer = "";
		
		int reminder ;//¸ò 
		while(n>0){
			reminder = n%3;//0,2
			n = n/3;//3,0
			if(reminder == 0){
				n -=1;//2
				reminder = 4;
			}
			answer = reminder+answer;
		}
		System.out.println(answer);
		return answer;
	}
}
