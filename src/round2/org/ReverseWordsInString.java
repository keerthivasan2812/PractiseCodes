package round2.org;

public class ReverseWordsInString {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		String sentence="the words are in english";
		String sentence1="";
		
		
		String reversedString=reverseString(sentence);
		String reversedString1=reverseString(sentence1);
		
		if(reversedString.equals("")) {
			
			System.out.println("enter a string");
		
		}else {
		System.out.println(reversedString);
		}
		
		
		if(reversedString1.equals("")) {
			System.out.println("enter a string");
			
		}else {
		System.out.println(reversedString1);
		}
		
		
	}

	
	
	public static String reverseString(String s) {
		
		
		if(s.length()==0) {
			
			
			return "";
		}
			
			
		
		
		
		String[] split = s.split(" ");
	String h ="";
		
		
		for(int i=split.length-1;i>=0;i--) {
			
			
			h+=split[i]+" ";
			
			
			
			
			
		}
		
		
		return h;
		
		
	}
	
	
}
