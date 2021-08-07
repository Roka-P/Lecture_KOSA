package java0708;

public class _420SwitchStrExample {

	public static void main(String[] args) {
		String[] hello = {"안녕하세요", "헬로", "니하오", "곤니찌와"};
		
		int i = (int)(Math.random()*hello.length);
		System.out.println("선택된 단어 : " + hello[i]);
		
		switch(hello[i]) {
			case "안녕하세요" :
				System.out.println("한국어입니다.");
				break;
			case "헬로" :
				System.out.println("영어입니다.");
				break;
			case "니하오" :
				System.out.println("중국어입니다.");
				break;
			case "곤니찌와" :
				System.out.println("일본어입니다.");
				break;
			default :
				System.out.println("!?!?!?!?!?!?");
				break;
				
		}
	}

}
