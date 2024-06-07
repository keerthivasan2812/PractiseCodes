package round2.org;

public class alphabetcheck {
	
//	
//	1. Pangram Checking
//
//	Check whether all english alphabets are present in the given sentence or not
//
//	I/P: abc defGhi JklmnOP QRStuv wxyz
//
//	O/P: True
//
//	I/P: abc defGhi JklmnOP QRStuv
//
//	O/P: False
	
	
	
//	
//
	
	
	public static Boolean length(String s) {
		String check="abcdefGhiJklmnOPQRStuvwxyz";
		if(check.length()==s.length()) {
			
			System.out.println("the given string satisfies the length condition");
			
			
			return true;
			
		} else {
            System.out.println("The given string does not satisfy the length condition");
            return false;
        }
		
		
		
	
		
	}
	
	public static Boolean word(String h) {
		String check="abcdefGhiJklmnOPQRStuvwxyz";
		
		for(int i=0;i<h.length();i++) {
			char l = h.charAt(i);
			
			if(check.indexOf(l)==-1) {
				
				return false;
				
				
			}
			
		
			
			
		}
		
		
		return true;
		
		
	}
	
	public static void main(String[] args) {
		
		String input="bc defGhi JklmnOP QRStuv wxyz";
		
		
		
		String t = input.replace(" ", "");
		
	if(	length(t)&&word(t)) {
		System.out.println("all the alphabet is present in the given string");
	}
	else {
		System.out.println("not all the alphabet are present in the the given strinh");
	}
		
		
		
		
		
		
		
		
	}

}
