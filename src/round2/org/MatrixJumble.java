package round2.org;

public class MatrixJumble {
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int[][] array= {{8,6,5,9,9},{6,8,9,6,5,},{6,7,8}};
		
		
		for(int i=0;i<=2;i++) {
			reverseArray(array[i]);
			
			for(int j=0;j<array[i].length;j++) {
				
				
				
				
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
	}
	
	
	public static void reverseArray(int[] array) {
		
		int start =0;
		
		int end=array.length-1;
		
	
		
		
		
		
		while(start<end) {
			int temp= array[start];
			array[start]=array[end];
			array[end]=temp;
			
			start++;
			end--;
			
		}
		
		
	}

}
