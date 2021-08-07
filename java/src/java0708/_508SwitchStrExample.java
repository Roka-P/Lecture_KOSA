package java0708;

public class _508SwitchStrExample {

	public static void main(String[] args) {
		String[] hello = {"?•ˆ?…•?•˜?„¸?š”", "?—¬ë¡?", "?‹ˆ?•˜?˜¤", "ê³¤ë‹ˆì°Œì?"};
		
		int i = (int)(Math.random()*hello.length);
		System.out.println("?„ ?ƒ?œ ?‹¨?–´ : " + hello[i]);
		
		switch(hello[i]) {
			case "?•ˆ?…•?•˜?„¸?š”" :
				System.out.println("?•œêµ??–´?…?‹ˆ?‹¤.");
				break;
			case "?—¬ë¡?" :
				System.out.println("?˜?–´?…?‹ˆ?‹¤.");
				break;
			case "?‹ˆ?•˜?˜¤" :
				System.out.println("ì¤‘êµ­?–´?…?‹ˆ?‹¤.");
				break;
			case "ê³¤ë‹ˆì°Œì?" :
				System.out.println("?¼ë³¸ì–´?…?‹ˆ?‹¤.");
				break;
			default :
				System.out.println("!?!?!?!?!?!?");
				break;
				
		}
	}

}
