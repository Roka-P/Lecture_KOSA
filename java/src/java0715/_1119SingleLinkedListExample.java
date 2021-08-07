package java0715;

public class _1119SingleLinkedListExample {

	public static void main(String[] args) {
		_1119SingleLinkedList<String> list = new _1119SingleLinkedList<String>();
		System.out.println(list);
		list.add("A");
		list.add("B");
		list.add("D");
		list.add(2, "F");
		list.removeFirst();
		list.remove(1);
		list.add("C");
		list.add("E");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.indexOf("A"));
		System.out.println(list.indexOf("C"));
		System.out.println(list.indexOf(new String("C")));
		
		String[] strArray = list.toArray(new String[list.size]);
		for (String data : strArray) {
			System.out.print(data + " ");
		}
	}

}
