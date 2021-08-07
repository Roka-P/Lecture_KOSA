package java0708;

public class _413IfExample {

	public static void main(String[] args) {
		int rand = (int)(Math.random() * 100);
		
		System.out.println("랜덤값 : " + rand);
		if (rand >= 60)
			System.out.println("60점 이상인 점수입니다.");
		else
			System.out.println("60보다 작은 점수입니다.");
	}

}
