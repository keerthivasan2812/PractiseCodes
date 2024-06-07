package round2.org;

public class Fibonacci2 {
	
	
	public static void main(String[] args) {
		
		
		int n=10;
		int p=0;
		int v=1;
		for(int i=0;i<n;i++) {
			
			
			System.out.println("the fibonacci series is"+p);
			int next=p+v;
			
			p=v;
			v=next;
			
			
			
			
		}
		
	}

}
