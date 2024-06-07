package round2.org;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePractise {
	
	
	public static void main(String[] args) {
		
		
		Queue b=new LinkedList();
		
		Scanner h=new Scanner(System.in);
		
		
		System.out.println("enter the number of customers is there");
		
		int l = h.nextInt();
		
		 h.nextLine();
		
	
		
		for(int i=0;i<=l;i++) {
			 System.out.println("Enter the name of customer " + (i+1) + ":");
	            String name = h.nextLine();
			
			
			if(name.isEmpty()) {
				
				System.out.println("enter something to enter");
				i--;
				
				
			}else {
				
				
				System.out.println("enter th elements successfully");
				
				b.offer(name);
				
				System.out.println("the element entred is"+name);
				
			}
			
			if(i==l) {
				
				System.out.println("the stack as been filled");
				
			}
			
			
			
			
		}
		while (!b.isEmpty()) {
             Object poll = b.poll();
            System.out.println("Polled element: " + poll);
        }

        h.close();
		
		
		
		
		
		
	}

}
