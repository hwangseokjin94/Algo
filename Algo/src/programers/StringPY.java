package programers;

public class StringPY {

	public static boolean solution(String s) {
	        boolean answer = true;
	        s = s.toUpperCase();
	        int pcount = 0 ,ycount = 0;
	        char[] temp =s.toCharArray();
	        for (int i = 0 ; i< temp.length;i++){
	        	if(temp[i] == 'P'){
	        		pcount++;
	        	}else if(temp[i] == 'Y'){
	        		ycount++;
	        	}	        		        
	        }
	        if(pcount == ycount){
	        	return answer;
	        }else{
	        	return false;
			}
	       
	        
	    }
	
	
	public static void main(String[] args) {
		String s = "pPoooyY";

		solution(s);
		System.out.println(solution(s));
	}

}
