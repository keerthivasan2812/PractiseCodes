package round2.org;

public class MatrixMultiplication {
	
	
	public static void main(String[] args) {
		
	
	
	int[][] array= {{5,6,7,9,6},{3,4,8,7,6},{5,6,7,9,6},{3,4,8,7,6}};
	int[][] array1= {{5,6,7,9,6},{3,4,8,7,6},{5,6,7,9,6},{3,4,8,7,6}};
	
	int[][] result=new int[4][5];
	
	
	for(int i=0;i<4;i++) {
		
		
		
	for(int j=0;j<5;j++) {
		
		result[i][j]=array[i][j]*array1[i][j];
		
		
	}
	
	}
	
	for(int i=0;i<4;i++) {
		
		
		
		for(int j=0;j<5;j++) {
			
			System.out.print(result[i][j]+"  ");
			
			
		}
		System.out.println();
		
		}
	
	
	

}
}