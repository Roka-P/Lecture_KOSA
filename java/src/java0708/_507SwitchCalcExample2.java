package java0708;

import java.util.Scanner;

public class _507SwitchCalcExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("?��?�� ?�� 명령?�� ?��?���? 값을 ?��?��?�� ?��?��?��.");
		System.out.println("?��?��?��: java SwithCalcExample 5 x 6");
		int first = scan.nextInt();
		char op = scan.next().charAt(0);
		int second = scan.nextInt();
		
		switch(op) {
			case '+' :
				System.out.println(first + second);
				break;
			case 'x' :
				System.out.println(first * second);
				break;
			case '/' :
				System.out.println(first / second);
				break;
			case '-' :
				System.out.println(first - second);
				break;
			default :
				System.out.println("?��못된 ?��?��?��?��?��?��.");
		}
		scan.close(); // *****
	}

}
