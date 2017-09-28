package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class collections {

	public static void main(String[] args) {
		//array list can have duplicate values
		ArrayList myList = new ArrayList();
		myList.add("first");
		myList.add("second");
		myList.add("third");
		System.out.println(myList.get(2));
		System.out.println(myList.size());
		
		for(int i=0; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
	
	//sets can have duplicate but are like lists
		Set<Integer> set = new HashSet<Integer>();
			set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			
			Iterator<Integer> itrate = set.iterator();
			
			System.out.println(itrate.next());
			System.out.println(itrate.next());
			System.out.println(itrate.next());
			System.out.println(itrate.next());
	
	
	}
	

}
