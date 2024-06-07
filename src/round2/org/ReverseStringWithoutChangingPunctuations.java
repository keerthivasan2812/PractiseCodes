package round2.org;

public class ReverseStringWithoutChangingPunctuations {
	
	public static void main(String[] args) {
		String input="house no : 123@ cbe";
		String output=reverseStringPreservingPosition(input);
		System.out.println(output);
	}

	private static String reverseStringPreservingPosition(String input) {
		// TODO Auto-generated method stub
		
		char[] ca = input.toCharArray();
		char[] reversechar=new char[ca.length];
		
		int j=0;
		
		for(int i=ca.length-1;i>=0;i--) {
			if(Character.isLetterOrDigit(ca[i])) {
				
				reversechar[j++]=ca[i];
				
			}
		}
		
		j=0;
		for(int i=0;i<ca.length;i++) {
			if(Character.isLetterOrDigit(ca[i])) {
				
				ca[i]=reversechar[j++];
				
			}
		}
		
		
		return new String(ca);
	}

}
