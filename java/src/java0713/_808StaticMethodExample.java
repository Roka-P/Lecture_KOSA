package java0713;

public class _808StaticMethodExample {

	public static void main(String[] args) {
		System.out.println("Count.doIt : " + _808StaticCount.doIt());
		System.out.println("Count.doIt : " + _808StaticCount.doIt());
		System.out.println("Count.doIt : " + _808StaticCount.doIt());
		
		_808StaticCount cnt = new _808StaticCount();
		cnt.a++;
		System.out.println(cnt.a);
	}

}
