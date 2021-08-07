package java0708;

public class _414IfExample2 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("점수 : " + score);
		if (score >= 60) {
			System.out.println("60점 이상인 점수입니다.");
			System.out.println("합격하셨습니다.");
		} else {
			System.out.println("60보다 작은 점수입니다.");
			System.out.println("불합격하셨습니다.");
		}
	}

}
