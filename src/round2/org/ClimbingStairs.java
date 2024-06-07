package round2.org;

public class ClimbingStairs {
	
	
	
	
	public static void main(String[] args) {
		
		int n1=2;
		int n2=4;
		int n3=5;
		
		int result1=countTheStairs(n1);
		int result2=countTheStairs(n2);
		int result3=countTheStairs(n3);
		System.out.println(result1);
		
		
		
	}
	
	public static int countTheStairs (int g) {
		
		if(g<=2) {
			
			return g;
		}
		
		int[] dp=new int[g+1];
		
		dp[1]=1;
		dp[2]=2;
		
		for(int i=3;i<=g;i++) {
			
			dp[i]=dp[i-1]+dp[i-2];
			
			
		}
		
		return dp[g];
		
		
		
		
	}

}
