package java0708;

import java.util.Scanner;

public class _419SwitchCalcExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("실행 시 명령행 인자를 값을 넣어야 합니다.");
		System.out.println("사용예: java SwithCalcExample 5 x 6");
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
				System.out.println("잘못된 연산식입니다.");
		}
		scan.close(); // *****
	}

}
