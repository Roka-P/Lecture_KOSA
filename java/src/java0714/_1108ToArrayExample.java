package java0714;

import java.util.HashSet;
import java.util.Set;

public class _1108ToArrayExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("three");
		set.add("one");
		set.add("two");
		set.add("four");
		set.add("five");
		
		String[] strArray = set.toArray(new String[set.size()]);
		for (String str : strArray) {
			System.out.println(str);
		}
				
 	}

}
