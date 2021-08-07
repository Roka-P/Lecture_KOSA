package java0708;

public class _419SwitchCalcExample {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("실행 시 명령행 인자를 값을 넣어야 합니다.");
			System.out.println("사용예: java SwithCalcExample 5 x 6");
			return;
		}
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[2]);
		
		switch(args[1].charAt(0)) {
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
	}

}
