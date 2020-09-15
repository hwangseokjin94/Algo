package programers.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//https://programmers.co.kr/learn/courses/30/lessons/12917
public class StringDesc {

	public static String solution(String s) {
		Character [] arr = new Character [s.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		s = "";
		for(int i=0; i<arr.length; i++) {
			s += arr[i];
		}
		System.out.println(s);
		return s;
			
	}

	public static void main(String[] args) {
			String s = "Zbcdefg";
			solution(s);
	}
}
