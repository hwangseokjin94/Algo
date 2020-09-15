package programers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://programmers.co.kr/learn/courses/30/lessons/12915
public class StringMySort {
	public static String[] solution(String[] strings, int n) {
		String[] answer =new String[strings.length];
		String[] arr=new String[strings.length];
		String[] arr2=new String[strings.length];
		
		for(int i =0;i<strings.length;i++){			
			arr[i] =strings[i].substring(n,n+1);
			arr2[i]= arr[i]+strings[i];
			
		}
		Arrays.sort(arr2);
		

		for(int i =0;i<strings.length;i++){					
			System.out.println(arr2[i]);
			answer[i]=arr2[i].substring(1);
					
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		String[] strings = {"sun", "bed", "car"};
		int n = 1;		
		solution(strings, n);
	}
}
