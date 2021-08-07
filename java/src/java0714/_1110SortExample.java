package java0714;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _1110SortExample {

	public static void main(String[] args) {
		
		List<_1110Tiger> list = new ArrayList<_1110Tiger>();
		list.add(new _1110Tiger("라이거"));
		list.add(new _1110Tiger("백호"));
		list.add(new _1110Tiger("한라산"));
		list.add(new _1110Tiger("백두"));
		
		Collections.sort(list);
		
		for (_1110Tiger t : list) {
			System.out.println(t.name);
		}
	}

}
