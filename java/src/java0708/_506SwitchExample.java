package java0708;

public class _506SwitchExample {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("?��?�� : " + score);
		switch (score/10) {
			case 9: 
				System.out.println("?��?��?�� ?��?��?? A?��?��?��.");
				break;
			case 8: 
				System.out.println("?��?��?�� ?��?��?? B?��?��?��.");
				break;
			case 7: 
				System.out.println("?��?��?�� ?��?��?? C?��?��?��.");
				break;
			case 6:
				System.out.println("?��?��?�� ?��?��?? D?��?��?��.");
				break;
			default:
				System.out.println("?��?��?�� ?��?��?? F?��?��?��.");
				System.out.println("?��?��?? ?��?���? ???��?��?��?��?��.");
				break;
			}
	}

}
