package java0714;

import java.util.TreeSet;

public class _1111ComparatorExample {

	public static void main(String[] args) {
		_1111Employee e1 = new _1111Employee("È«±æµ¿", 20000);
		_1111Employee e2 = new _1111Employee("±èÁø¼÷", 30000);
		_1111Employee e3 = new _1111Employee("ÇãÇöÁ¤", 70000);
		_1111Employee e4 = new _1111Employee("ÀÌ¼ø½Å", 40000);
		
		TreeSet<_1111Employee> list = new TreeSet<_1111Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for (_1111Employee e : list) {
			System.out.println(e);
		}
	}

}
