package java0708;

public class _507SwitchCalcExample {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("?��?�� ?�� 명령?�� ?��?���? 값을 ?��?��?�� ?��?��?��.");
			System.out.println("?��?��?��: java SwithCalcExample 5 x 6");
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
				System.out.println("?��못된 ?��?��?��?��?��?��.");
		}
	}

}
