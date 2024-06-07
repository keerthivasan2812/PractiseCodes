package round2.org;

public class Palindrome3 {
	
	
	public static void main(String[] args) {
		
		String h="ysy";
		
		boolean v=isPalindrome(h);
		
		if(v) {
			System.out.println("it is a palindrome");
			
		}else {
			System.out.println("it is not a palindrome");
		}
		
		
		
	}
	
	public static boolean isPalindrome(String s) {
		
	StringBuilder r=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			 
			
			r.append(s.charAt(i));
			
		}
		
		
		return s.equals(r.toString());
		
	}
	
	

}
