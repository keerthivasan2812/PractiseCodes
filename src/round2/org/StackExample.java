package round2.org;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
	
	
	private static String n;

	public static void main(String[] args) {
		
		
		Stack v=new Stack();
		
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the number of names to enter into the stack:");
	
	int m = s.nextInt();
	 s.nextLine(); // Consume newli
	System.out.println("enter a name to enter into stack");
	
	for(int i=0;i<=m;i++) {
		
		
		
		n = s.nextLine();
		
		if(n.equals("")) {
			
			System.out.println("enter something to enter into the stack");
			i--;
			
		}
		else {
			
			v.push(n);
			System.out.println("successfully entered the name" +n);
			
			
			
		}
		
		if(i==m) {
			
			System.out.println("sorry the the names you entered here are full");
			
			
			
			
		}
		
		
		
		
		
	};
	  System.out.println("Names entered into the stack:");
      for (int i = v.size() - 1; i >= 0; i--) {
          System.out.println(v.get(i));
      }

      s.close();
	
	
	
		
	}
	

}
