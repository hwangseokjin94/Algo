package BaekJonn;

import java.util.Scanner;
import java.util.Stack;

//https://www.acmicpc.net/problem/10773
public class B10773 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int numScope = sc.nextInt();
		int num, sum =0;
		for (int i = 0; i < numScope; i++) {
			num = sc.nextInt();
			if (num == 0) {
				stack.pop();
			} else {
				stack.add(num);
			}
		} // for
		System.out.println(stack);
		/* sum */
		while (!stack.isEmpty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
	}
}
