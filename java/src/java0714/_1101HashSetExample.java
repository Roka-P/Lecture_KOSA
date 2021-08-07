package java0714;

import java.util.*;

public class _1101HashSetExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		boolean isAdded = set.add("five");
		
		System.out.println(set);
		System.out.println(isAdded);
		
		System.out.println(set.size());
		
		set.remove("two");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		if (set.isEmpty()) {
			System.out.println("set is Empty");
		}
	}

}
