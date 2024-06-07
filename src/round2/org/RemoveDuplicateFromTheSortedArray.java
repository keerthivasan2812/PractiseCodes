package round2.org;

public class RemoveDuplicateFromTheSortedArray {
	
	
	
	public static void main(String[] args) {
		
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
	int k=findDuplicatesElement(nums);
	
	System.out.println("the number of unique elements are"+k);
				
				
				
	for (int i = 0; i < k; i++) {
	    System.out.println(nums[i]);
	}
			
			
			
		
		
	}
	
	public static int findDuplicatesElement(int[] nums) {
		
		
		if(nums.length==0) {
			
			return 0;
			
		}
		int uniquecount=1;
		
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i] !=nums[i-1]) {
				
				
				nums[uniquecount]=nums[i];
				uniquecount++;
			}
			
			
			
		}
		
		return uniquecount;
		
		
	}

}
