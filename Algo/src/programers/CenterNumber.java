package programers;

public class CenterNumber {
  public static String solution(String s) {
	        String answer = "";
	        int num = s.length();
	        System.out.println(num);
	        if(num%2 == 0){
	        	answer += s.substring((num/2)-1, (num/2)+1);	        	

	        }else{
	        	int num2 = num/2;
	        	answer += s.substring(num2, num2+1);
	        }
	        
	        System.out.println(answer);
	        return answer;
    }
	
	
	public static void main(String[] args) {
		String s = "123456789";
		solution(s);
	}
}
