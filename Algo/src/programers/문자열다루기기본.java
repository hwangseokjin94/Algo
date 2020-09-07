package programers;

public class 문자열다루기기본 {
	public static boolean solution(String s) {
		boolean answer = true;
		char arr[] = s.toCharArray();
		char num[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		int count = 0;
		if(s.length() != 4 && s.length()!=6){
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < num.length; j++) {
					if (num[j] == arr[i]) {
						count++;
					}
				}
			}
		}
		
		if (count == arr.length) {			
			return answer;
		} else {			
			answer = false;			
			return answer;
		}
	}//

	public static void main(String[] args) {
		String s = "2 3459";
		solution(s);
	}

}
