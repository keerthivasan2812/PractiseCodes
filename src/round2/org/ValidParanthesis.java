package round2.org;

import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String[] args) {
		
		
		String bracket="}";
		
		String bracket2="(}}[]";
		
		boolean result=checkBracketMatches(bracket2);
		
		if(!result) {
			System.out.println("its not matching");
			
		}else {
			
			System.out.println("it is possible");
			
		}
		
		
	}
	
	
	public static  boolean	  	checkBracketMatches(String s) {
		
		
		
		Stack<Character> stack=new Stack();
		
		for(char c:s.toCharArray()) {
			
			if(c=='{'||c=='['||c=='(') {
				
				stack.push(c);
					
			}else {
				
				
				if(stack.isEmpty()||!checkClosingBracket(stack.pop(),c)) {
					
					
					return false;
				}
				
				
			}
			
		}
		return stack.isEmpty();
		
	}


	private static 	boolean	checkClosingBracket(Character opening, char closing					) {
		// TODO Auto-generated method stub
		return (opening=='{'&&closing=='}')||
				(opening=='['&&closing==']')||
				(opening=='('&&closing==')');
				
		
		
		
	}

}
