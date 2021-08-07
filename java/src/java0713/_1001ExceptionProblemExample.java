package java0713;

public class _1001ExceptionProblemExample {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = {"안녕하세요","반갑습니다.","또 오세요."};
		while (i < 4) {
			System.out.println(greetings[i]);
			i++;
		}
		System.out.println("메인의 마지막입니다.");
	}

}
