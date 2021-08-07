package java0708;

public class _502IfExample2 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 100);
		
		System.out.println("? ?ˆ˜ : " + score);
		if (score >= 60) {
			System.out.println("60?  ?´?ƒ?¸ ? ?ˆ˜?…?‹ˆ?‹¤.");
			System.out.println("?•©ê²©í•˜?…¨?Šµ?‹ˆ?‹¤.");
		} else {
			System.out.println("60ë³´ë‹¤ ?‘?? ? ?ˆ˜?…?‹ˆ?‹¤.");
			System.out.println("ë¶ˆí•©ê²©í•˜?…¨?Šµ?‹ˆ?‹¤.");
		}
	}

}
