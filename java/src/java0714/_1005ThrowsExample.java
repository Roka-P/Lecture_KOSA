package java0714;

public class _1005ThrowsExample {
	
	static String[] greetings = {"안녕하세요.", "반갑습니다.", "또 오세요."};
	
	public static void main(String[] args) {
		int i = (int)(Math.random()*4);

		try {
			doIt(i);
		} catch(Exception e) {
			System.out.println("main에서 예외처리 헀습니다.");
		}
	}

	public static void doIt(int index) throws ArrayIndexOutOfBoundsException {
		System.out.println(greetings[index]);
		
	}
	
	
}
