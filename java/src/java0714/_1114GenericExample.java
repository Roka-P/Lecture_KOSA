package java0714;

import java.util.ArrayList;

public class _1114GenericExample {

	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<>();
		
		lists.add("first");
		lists.add("second");
		lists.add("third");		
//		lists.add(new Integer(4)); Error
//		lists.add(new Float(5.0f)); Error
		
		String s1 = lists.get(0);
		System.out.println(s1);
		
		for (String s : lists) {
			System.out.println(s);
		}
	}

}
