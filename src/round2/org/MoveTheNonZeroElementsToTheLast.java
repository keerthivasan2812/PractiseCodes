package round2.org;

import java.util.LinkedList;

public class MoveTheNonZeroElementsToTheLast {
	
	
	
	
	
//	
//	input 0 1 0 2 3
//	
//	output 1 2 3 0 0
//	
	
	
	public static void main(String[] args) {
		
		
		int input[]= {0,1,0,2,3};
		
		LinkedList <Integer> l= new LinkedList<Integer>();
		
		for(int i = 0;i<input.length;i++) {
			
			
			
			
			if(input[i]!=0) {
				l.add(input[i]);
			}
	
			
		}
for(int i = 0;i<input.length;i++) {
			
			
			
			
			if(input[i]==0) {
				l.addLast(input[i]);
			}
			
			
			
			
			
			
			
		}
		
		
	
		
		System.out.println(l);
		
		
	}
	
	
	

}
