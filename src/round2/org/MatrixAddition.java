package round2.org;

public class MatrixAddition {
	
	
	
	
	public static void main(String[] args) {
		
		
		int[][] array= {{4,6,7,8},{7,8,9,5}};
		
		int[][] array2= {{8,9,7,10},{7,18,91,51}};
		
		
		int[][] result=new int[2][4];
		
		
		for(int i=0;i<2;i++) {
			
			
			
			for(int j=0;j<4;j++ ) {
				
			result[i][j]=	array[i][j]+array2[i][j];
				
			}
			
			
			
			
			
		}
		
		
		
		for(int i=0;i<2;i++) {
			
			
			for(int j=0;j<4;j++) {
				
				System.out.print(result[i][j]+" ");
				
				System.out.println();
			}
			
			
			
		}
		
		
		
		
	}

}
