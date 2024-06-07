package round2.org;

public class FirstOccurrences {
	
	
	
	public static void main(String[] args) {
        String s = "ZOHOCORPORATION PORT";
        String second = "PORT";
        String result = findCharactersInRange(s, second);
        System.out.println(result);
        // Output: OHOCORPORAT
    }

    public static String findCharactersInRange(String s, String second) {
    	
    	int minindex=Integer.MAX_VALUE;
    	
    	int maxindex=Integer.MIN_VALUE;
    	
    	
    	for(int i=0;i<second.length();i++) {
    		
    		char c= second.charAt(i);
    		
    		int index= s.indexOf(c);
    		
    		if(index !=-1&& index<minindex) {
    			minindex=index;
    		}
    		if(index !=-1&& index>maxindex) {
    			maxindex=index;
    		}
    		
    	}
        
    	return s.substring(minindex,maxindex+1);
    	
    }

}
