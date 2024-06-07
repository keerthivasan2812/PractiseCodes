package round2.org;

public class TheLengthOfTheLastString {
	
	
	public static void main(String[] args) {
		
		String s="the sun rises in the eastu";
		
		
		String result=FindLength(s);
		
		int length = result.length();
		
		System.out.println("the length of the index of last string "+length);
				
	}
	
	
	
	public static String FindLength(String g) {
		
		String[] split = g.split(" ");
		int k = split.length;
		String j="";
		
		for(int i=0;i<split.length;i++) {
			
	if(i==k-1) {
		
	j+=split[i];
		
	}
			
			
		
		}
		
		
	return j;
		
		
		
	}

}
