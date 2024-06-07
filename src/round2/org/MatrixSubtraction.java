package round2.org;

public class MatrixSubtraction {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		int[][] array= {{6,8,9,6,8,7},{8,9,9,4,6,3},{3,98,78,56,78,56}};
		
		
		int[][] array1= {{6,8,9,6,8,7},{8,9,9,4,6,3},{3,98,78,56,78,56}};
		
		
		
		int[][] result= new int[3][6];
		
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<6;j++) {
				
				result[i][j]=array1[i][j]-array[i][j];
				
				
			}
			
			
			
		}
		
	
		
		
		
		
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<6;j++) {
				
				System.out.print(result[i][j]+" ");
			
		
		            }
		
		System.out.println();
		
		
		
	}
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	


