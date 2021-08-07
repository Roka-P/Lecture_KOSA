package java0714;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _1107IteratorExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		
//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		for(Object obj : set) {
			System.out.println(obj.toString());
		}
	}

}
