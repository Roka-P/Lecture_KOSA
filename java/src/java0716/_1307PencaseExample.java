package java0716;

import java.util.HashSet;

public class _1307PencaseExample {

	public static void main(String[] args) {
		_1307Pen p1 = new _1307Pen("p0001", "說除も");
		_1307Pen p2 = new _1307Pen("p0001", "說除も");

		HashSet<_1307Pen> pens = new HashSet<_1307Pen>();
		System.out.println(pens.add(p1));
		System.out.println(pens.add(p2));
		for (_1307Pen pen : pens) {
			System.out.println(pen);
		}
	}
}
