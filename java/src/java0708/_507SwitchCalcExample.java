package java0708;

public class _507SwitchCalcExample {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("?‹¤?–‰ ?‹œ ëª…ë ¹?–‰ ?¸?ë¥? ê°’ì„ ?„£?–´?•¼ ?•©?‹ˆ?‹¤.");
			System.out.println("?‚¬?š©?˜ˆ: java SwithCalcExample 5 x 6");
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
				System.out.println("?˜ëª»ëœ ?—°?‚°?‹?…?‹ˆ?‹¤.");
		}
	}

}
