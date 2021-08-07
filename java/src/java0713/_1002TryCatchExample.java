package java0713;

public class _1002TryCatchExample {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = {"안녕하세요","반갑습니다.","또 오세요."};
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("예외 발생했습니다.");
				System.out.println("예외가 발생한 원인은 " + e.getMessage());
				System.out.println("예외처리를 완료했습니다.");
			} finally {
				System.out.println("finally 문은 항상 실행됩니다.");
			}
			i++;
		}
		System.out.println("메인의 마지막입니다.");
	}

}
