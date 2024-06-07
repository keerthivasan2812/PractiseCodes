package round2.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Union {
	
	
	
	
	
//	Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
//
//	Input
//
//	List 1: 1,3,4,5,6,8,9
//
//	List 2: 1, 5,8,9,2
//
//
//
//	Union: 1, 3,4,5,6,8,9,2
//
//	Intersection: 1,5,8,9
//
//	Except: 1, 3, 5,9,8,2 
//

	public static void main(String[] args) {
		
		List <Integer> l1=new LinkedList();
		
		List<Integer> l2=new LinkedList();
		
		
		
		int [] a1= {1,3,4,5,6,8,9};
		
		int [] a2= {1,5,8,9,2};
		
		
		for(int b1:a1) {
			
			l1.add(b1);
			
		}
for(int b2:a2) {

	l2.add(b2);
			
		}
		

	
	
	
//Union
Set<Integer> unionSet = new LinkedHashSet<>();
unionSet.addAll(l1);
unionSet.addAll(l2);
System.out.println("Union: " + unionSet);

// Intersection
Set<Integer> intersectionSet = new HashSet<>(l1);
intersectionSet.retainAll(l2);
System.out.println("Intersection: " + intersectionSet);

// Except
List<Integer> exceptList = new LinkedList();


//Remove even elements from list1
for (Integer num : l1) {
    if (num % 2 != 0) {
        exceptList.add(num);
    }
}

// Remove odd elements from list2
for (Integer num : l2) {
    if (num % 2 == 0) {
        exceptList.add(num);
    }
}

System.out.println(exceptList);



	}
	

}
