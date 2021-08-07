package java0708;

public class _415IfExample3 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("점수 : " + score);
		if (score >= 60) {
			System.out.println("60점 이상인 점수입니다.");
			System.out.println("합격하셨습니다.");
		}
		System.out.println("수고하셨습니다.");
		}
	}
