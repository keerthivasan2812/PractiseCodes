package round2.org;

public class LongestPrefixInaString {
	
//	Write a function to find the longest common prefix string amongst an array of strings.
//
//	If there is no common prefix, return an empty string 
	
	public static void main(String[] args) {
		
		
		String[] array1= {"flower","flow","flight"};
		
		
		String[] array2= {"dog","racecar","car"};
		
		
		String result=findTheCommonPrefix(array1);
		String result2=findTheCommonPrefix(array2);
		
		if(result==null) {
			System.out.println("the prefix is not common for everything");
			
			
		}else {
			
			System.out.println("the longest commpon prefix is "+result);
		}
		
		if(result2=="") {
			System.out.println("the prefix is not common for everything");
			
			
		}else {
			
			System.out.println("the longest commpon prefix is "+result2);
		}
		
	}
	
	public static String findTheCommonPrefix(String[]s1) {
		
		String prefix=s1[0];
		
		if(s1==null||s1.length==0) {
		return "";
			
		}
		
		 for (int i = 1; i < s1.length; i++) {
			 
			 while(!s1[i].startsWith(prefix)) {
				 
				 prefix=prefix.substring(0,prefix.length()-1);
				 
				 if(prefix.isEmpty()) {
					 
					 return "";
				 }
			 }
			 
			 
		 }
			
	
			return prefix;
			
		}
		
		
		
		
		
	}
	


