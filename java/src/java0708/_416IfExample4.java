package java0708;

public class _416IfExample4 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("점수 : " + score);
		if (score >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		} else if (score >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		} else if (score >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		} else if (score >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		} else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자입니다.");
		}
	}
}
