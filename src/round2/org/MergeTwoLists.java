package round2.org;

import java.util.LinkedList;

public class MergeTwoLists {
	
	
	public static void main(String[] args) {
		
		 int[] list1 = {1, 2, 4};
	        int[] list2 = {1, 3, 4};
	        
	        LinkedList<Integer> l = new LinkedList<>();
	        LinkedList<Integer> l1 = new LinkedList<>();
	        LinkedList<Integer> r = new LinkedList<>();
	        
	        for (int h : list1) {
	            l.add(h);
	        }
	        for (int h : list2) {
	            l1.add(h);
	        }
	        
	        int k = 0; // Index for both lists
	        
	        // Merge the two lists while ensuring sorting
	        while (k < l.size() && k < l1.size()) {
	            int val1 = l.get(k);
	            int val2 = l1.get(k);
	            
	            if (val1 <= val2) {
	                r.add(val1);
	                r.add(val2);
	            } else {
	                r.add(val2);
	                r.add(val1);
	            }
	            
	            k++;
	        }
	        
	        // Add remaining elements from list1, if any
	        while (k < l.size()) {
	            r.add(l.get(k));
	            k++;
	        }
	        
	        // Add remaining elements from list2, if any
	        while (k < l1.size()) {
	            r.add(l1.get(k));
	            k++;
	        }
	        
	        System.out.println(r);
		
		}
		
		
		
	

}
