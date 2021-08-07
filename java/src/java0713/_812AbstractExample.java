package java0713;

public class _812AbstractExample {

	public static void main(String[] args) {
		_812Shape circle = new _812Circle(10);
		
		System.out.println("원의 넓이는 : " + circle.getArea());
		System.out.println("도형의 위치는 : " + circle.position());
	}

}
