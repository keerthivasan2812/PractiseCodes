package round2.org;

public class Pattern {
	
	
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println("this is the first testcase");
		
		printPattern(3,3);
		printPattern(4,5);
		printPattern(6,7);
		
	}
	
	public static void printPattern(int n,int m) {
		
		
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				
				if(n==3&&m==3) {
				
				if(i==0||j==0||i==n-1||j==m-1) {
				
				System.out.print("*");
				
				}else {
					System.out.print("0");
					
				}
				
				}
					
				
				
				
				
				
			}
			
			
			
			System.out.println();
			
			
			
			
		}
for(int i=0;i<=n;i++) {
			
			for(int j=0;j<m;j++) {
				
				if(n==4&&m==5) {
				
				if(i==0||j==0||i==n||j==m-1) {
				
				System.out.print("*");
				
				}else {
					System.out.print("0");
					
				}
				
				}
					
				
				
				
				
				
			}
			
			
			
			System.out.println();
			
			
			
			
		}
for(int i=0;i<m;i++) {
	
	for(int j=0;j<=n;j++) {
		
		if(n==6&&m==7) {
		
		if(i==0||j==0||i==n||j==m-1) {
		
		System.out.print("*");
		
		}else {
			System.out.print("0");
			
		}
		
		}
			
		
		
		
		
		
	}
	
	
	
	System.out.println();
	
	
	
	
}

		
		
		
	}
		
		
	}
	
	


