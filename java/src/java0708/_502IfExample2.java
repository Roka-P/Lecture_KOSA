package java0708;

public class _502IfExample2 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("?��?�� : " + score);
		if (score >= 60) {
			System.out.println("60?�� ?��?��?�� ?��?��?��?��?��.");
			System.out.println("?��격하?��?��?��?��.");
		} else {
			System.out.println("60보다 ?��?? ?��?��?��?��?��.");
			System.out.println("불합격하?��?��?��?��.");
		}
	}

}
