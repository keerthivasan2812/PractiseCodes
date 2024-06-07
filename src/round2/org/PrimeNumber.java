package round2.org;

public class PrimeNumber {
	
	
	
	public static boolean isprime(int n) {
		
		if(n<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++) {
			
			if(n%i==0) {
				return false;
				
			}
		}
		
		return true;
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		int n=1;
		
		if(isprime(n)) {
			
			System.out.println("is a prime number");
		}
		else {
			
			System.out.println("it is not a prime number");
		}
		
		
	}

}
