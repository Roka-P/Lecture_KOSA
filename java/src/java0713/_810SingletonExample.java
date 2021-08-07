package java0713;

public class _810SingletonExample {

	public static void main(String[] args) {
		_810Company c1 = _810Company.getCompany();
		_810Company c2 = _810Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c1 == c2);
		System.out.println(c2);
	}

}
