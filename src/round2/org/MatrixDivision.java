package round2.org;

public class MatrixDivision {
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int[][] array= {{5,8},{8,9}};
		
		int[][] array1= {{8,8},{4,9}};
		
		int[][] result =new int[2][2];
		
		
		for(int i=0;i<=1;i++) {
			
			
			for(int j=0;j<=1;j++) {
				
				result[i][j]= array[i][j]/array1[i][j];
				
				
				
				
			}
			
		}

		
		for(int i=0;i<=1;i++) {
			
			
			for(int j=0;j<=1;j++) {
				
				System.out.print(result[i][j]+" ");
				
				
				
				
			}
			System.out.println();
			
		}
		
		
		
	}

}
