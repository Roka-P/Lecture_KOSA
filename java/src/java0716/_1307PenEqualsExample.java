package java0716;

public class _1307PenEqualsExample {

	public static void main(String[] args) {
		_1307Pen p1 = new _1307Pen("p0001", "說除も");
		_1307Pen p2 = new _1307Pen("p0001", "說除も");
		System.out.println("p1 == p2 : " + (p1 == p2));
		System.out.println("p1.equals(p2) : " + p1.equals(p2));
	}

}
