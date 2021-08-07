package java0714;


import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class _1113ComparatorExample {

	public static void main(String[] args) {
		
		_1113Employee e1 = new _1113Employee("È«±æµ¿", 20000);
		_1113Employee e2 = new _1113Employee("±èÁø¼÷", 30000);
		_1113Employee e3 = new _1113Employee("ÇãÇöÁ¤", 70000);
		_1113Employee e4 = new _1113Employee("ÀÌ¼ø½Å", 40000);
		
		TreeSet<_1113Employee> list = new TreeSet<_1113Employee>(new _1113EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for (_1113Employee e : list) {
			System.out.println(e);
		}
	}
}
