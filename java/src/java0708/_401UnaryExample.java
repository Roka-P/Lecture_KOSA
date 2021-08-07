package java0708;

public class _401UnaryExample {

	public static void main(String[] args) {
		int i = 1;
		int j = i++;
		System.out.println("후위연산자 : ");
		System.out.println("i의 값 : " + i);
		System.out.println("j의 값 : " + j);
		
		int x = 1;
		int y = ++i;
		System.out.println("후위연산자 : ");
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
	}

}
