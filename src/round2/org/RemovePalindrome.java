package round2.org;

public class RemovePalindrome {
	
	
	public static void main(String[] args) {
		
		String s="He did a good deed";
		
		checkPalindrome(s);
		
		
		
		
		
		
	}
	
	public static void checkPalindrome(String s) {
		String h="";
		
		String[] split = s.split(" ");
		
		
		
		
		for (int i = 0; i <split.length-1; i++) {
			
			
		String b=	split[i];
		
		if(!isPalindrome(b)){
			
			System.out.println(b +" ");
			
		}
		
			
		}
		
		
		
		
	}
	
	public static boolean isPalindrome(String word) {
		
		int left=0;
		int right=word.length()-1;
		
		while(left<right) {
			
			if(word.charAt(left)!=word.charAt(right)) {
				return false;
				
			}
			
			left++;
			right--;
		}
		
		return true;
		
		
	}
	
	
	
	

}
