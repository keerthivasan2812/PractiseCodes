package round2.org;

public class LInearSearch {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,8,9,6,56};
		
		
		int index=linearsearch(array,56);
		if(index !=-1) {
			System.out.println("the index of the intended element to be found is"+" "+index);
			
		}else {
			System.out.println("the element you desired is not been found sorry");
			
		}
		
		
		
	}
	public static int linearsearch(int[]in,int m) {
		
		for(int i=0;i<in.length;i++) {
			
			if(in[i]==m) {
				
				return i;
				
			}
			
				
			}
			
	
		return -1;
			
		}
		
		
	

}