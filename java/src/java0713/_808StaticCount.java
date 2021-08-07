package java0713;

public class _808StaticCount {
	public int a = 0;
	public static int b = 0;
	
	public static int doIt() {
//		return ++a; Error : Can't make a static reference to the non-static field a
		return ++b;
	}
}
