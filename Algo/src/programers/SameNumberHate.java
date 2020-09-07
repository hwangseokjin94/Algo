package programers;

public class SameNumberHate {
	public static int[] solution(int[] arr) {
        int[] answer ;        
        int count =1 ;
                
        for (int i = 1; i<arr.length; i++){
        	if ( arr[i-1]!= arr[i] ) {			
				count++;
			}
        }
        System.out.println(count);
        answer = new int[count]; //배열특징상 배열길이 선언을할때 count를 먼저파악한후 해야함
        int j=1;
        answer[0] =arr[0];
        for (int i = 1; i<arr.length; i++){
        	if ( arr[i-1]!= arr[i] ) {
        		answer[j] = arr[i];
        		j++;
        	}
        }
        for(int i =0 ; i<answer.length;i++){        	
        	System.out.print(answer[i]+" ");
        	        	
        }

        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		//int[] arr = {4,4,4,3,3};
		solution(arr);
		
	}
}
