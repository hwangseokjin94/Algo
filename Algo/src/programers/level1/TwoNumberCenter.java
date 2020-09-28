package programers.level1;

public class TwoNumberCenter {
	public static long solution(int a, int b) {
		long answer = 0;
		int temp = 0;
		if(a>b){
			temp = a;
			a =b;
			b= temp;
		}
		for(int i = a; i<= b;i++){
			answer += i;
		}		
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		solution(3, 5);

	}
}
