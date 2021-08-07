package java0714;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1112SortExample {

	public static void main(String[] args) {
		
		
		List<_1112Tiger> list = new ArrayList<_1112Tiger>();
		list.add(new _1112Tiger("���̰�"));
		list.add(new _1112Tiger("��ȣ"));
		list.add(new _1112Tiger("�Ѷ��"));
		list.add(new _1112Tiger("���"));
		
		Collections.sort(list, new _1112TigerComparator());
		
		for (_1112Tiger t : list) {
			System.out.println(t.name);
		}
	}

}
