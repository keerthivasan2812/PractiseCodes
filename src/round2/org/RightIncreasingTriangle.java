package round2.org;

public class RightIncreasingTriangle {
	
	
	public static void main(String[] args) {
		
		int row=5;
		
		
		for(int i=0;i<=row;i++) {
			
			
			for(int space=row;space>i;space--) {
				
				System.out.print("  ");
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print("*"+" ");
				
				
				
			}
			
			
			
			
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
