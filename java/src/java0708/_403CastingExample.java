package java0708;

public class _403CastingExample {

	public static void main(String[] args) {
		byte a = 100;
		int b = a; // Promotion
		byte c = (byte)b; //Type Casting
		System.out.printf("%d, %d, %d" + "\n", a, b, c);
		
		int d = 1522;
		byte e = (byte)d;
		System.out.println(e);
		
		double f = 3.6;
		d = (int)f;
		System.out.println(d);
	}

}
