package programers;

public class Year2016 {
	public static String solution(int a, int b) {
		String[] DayOfWeek = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int totalDay = 0;
		int StartDay =0;
		int EndDate = 0;
		for(int i = 1; i < a ; i ++){
			if( i==4||i==6||i==9||i==11){
				totalDay +=30;
			}else if(i == 2){
				totalDay +=29;				
			}else {
				totalDay += 31; 
			}			
		}
		totalDay +=b+4;
		String answer = "";
		answer += DayOfWeek[totalDay%7];
			System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		int a=1;
		int b=1;
		solution(a, b);
		
	}

}
