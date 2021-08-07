package java0713;

public class _808StaticVarExample {

	public static void main(String[] args) {
		_808StaticCount c1 = new _808StaticCount();
		c1.a++;
		c1.b++;
		System.out.println("Non-static a : " + c1.a);
		System.out.println("static b : " + c1.b);
		
		_808StaticCount c2 = new _808StaticCount();
		c2.a++;
		c2.b++;
		System.out.println("Non-static a : " + c2.a);
		System.out.println("static b : " + c2.b);
		
		_808StaticCount.b++;
		System.out.println();
		System.out.println("c1.b : " + c1.b);
		System.out.println("c2.b : " + c2.b);
		System.out.println("Count.b : " + _808StaticCount.b);
	}

}
