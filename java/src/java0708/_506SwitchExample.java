package java0708;

public class _506SwitchExample {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("? ?ˆ˜ : " + score);
		switch (score/10) {
			case 9: 
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? A?…?‹ˆ?‹¤.");
				break;
			case 8: 
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? B?…?‹ˆ?‹¤.");
				break;
			case 7: 
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? C?…?‹ˆ?‹¤.");
				break;
			case 6:
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? D?…?‹ˆ?‹¤.");
				break;
			default:
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? F?…?‹ˆ?‹¤.");
				System.out.println("?‹¹?‹ ?? ?¬?ˆ˜ê°? ???ƒ??…?‹ˆ?‹¤.");
				break;
			}
	}

}
