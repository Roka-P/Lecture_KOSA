package java0708;

public class _418SwitchExample {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("점수 : " + score);
		switch (score/10) {
			case 9: 
				System.out.println("당신의 학점은 A입니다.");
				break;
			case 8: 
				System.out.println("당신의 학점은 B입니다.");
				break;
			case 7: 
				System.out.println("당신의 학점은 C입니다.");
				break;
			case 6:
				System.out.println("당신의 학점은 D입니다.");
				break;
			default:
				System.out.println("당신의 학점은 F입니다.");
				System.out.println("당신은 재수강 대상자입니다.");
				break;
			}
	}

}
