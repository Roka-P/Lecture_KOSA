package java0714;

import java.util.TreeSet;

public class _1111ComparatorExample {

	public static void main(String[] args) {
		_1111Employee e1 = new _1111Employee("ȫ�浿", 20000);
		_1111Employee e2 = new _1111Employee("������", 30000);
		_1111Employee e3 = new _1111Employee("������", 70000);
		_1111Employee e4 = new _1111Employee("�̼���", 40000);
		
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
