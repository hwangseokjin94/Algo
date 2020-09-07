package programers;

public class ChessPan {
// ¡à¡à¡á¡á ¡á¡á¡á¡á¡á
	public static void main(String[] args) {
		String[][] cPan = new String[7][15];
		
		for(int i =0; i< cPan.length; i++){
			for(int j = 0 ;j <cPan[i].length; j++){
				cPan[i][j] ="";				
			}
			
		}
		for(int i =0; i< cPan.length; i+=2){
			for(int j = 0 ;j <cPan[0].length; j+=2){
				cPan[i][j] +="¡á";				
			}
			for(int j = 1 ;j <cPan[0].length; j+=2){
				cPan[i][j] +="¡à";			
			}			
		}
		for(int i =1; i< cPan.length; i+=2){
			for(int j = 1 ;j <cPan[0].length; j+=2){
				cPan[i][j] +="¡á";				
			}
			for(int j = 0 ;j <cPan[0].length; j+=2){
				cPan[i][j] +="¡à";			
			}			
		}
		
		for(int i =0; i< cPan.length; i++){
			for(int j = 0 ;j <cPan[0].length; j++){
				System.out.print(cPan[i][j]);
			}
			System.out.println();
		}
		System.out.println(cPan.length);
		System.out.println(cPan[0].length);
	}
	
}
//¡à¡á¡Þ¡ß