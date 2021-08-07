package java0716;

public class _1316MathClassExample {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.sin(30*(Math.PI/180)));
		System.out.println(Math.cos(30*(Math.PI/180)));
		System.out.println(Math.tan(45*(Math.PI/180)));
		System.out.println(Math.pow(2, 3));
		System.out.printf("%d %d %d %d\n", (int)-3.6, (int)-3.4, (int)3.5, (int)3.6);
		System.out.printf("%d %d %d %d\n", Math.round(-3.6), Math.round(-3.4), Math.round(3.5), Math.round(3.6));
		System.out.printf("%f %f %f %f\n", Math.ceil(-3.6), Math.ceil(-3.4), Math.ceil(3.5), Math.ceil(3.6));
		System.out.printf("%f %f %f %f\n", Math.floor(-3.6), Math.floor(-3.4), Math.floor(3.5), Math.floor(3.6));		
	}

}
