import java0712._806Super;

public class _806ModifierExample {

	public static void main(String[] args) {
		System.out.println("*****Super 참조*****");
		_806Super sup = new _806Super();
		System.out.println("num1 = " + sup.num1 + 
//							"\tnum2 = " + sup.num2 +
//							"\tnum3 = " + sup.num3 +
							"\tnum4 = " + sup.getNum4());
		
		System.out.println("\n*****Sub 참조*****");
		_806Sub sub = new _806Sub();
		sub.print();
	}
}