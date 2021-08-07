package java0708;

import java.util.Scanner;

public class _505IfExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("? ?ˆ˜ë¥? ?…? ¥?•˜?„¸?š”.");
		int score = scanner.nextInt();
		
		System.out.println("? ?ˆ˜ : " + score);
		if (score >= 90) {
			if (score > 100) {
				System.out.println("?˜ëª? ?…? ¥?œ ? ?ˆ˜?…?‹ˆ?‹¤.");
			} else {
				System.out.println("?‹¹?‹ ?˜ ?•™? ?? A?…?‹ˆ?‹¤.");
			}
		} else if (score >= 80) {
			System.out.println("?‹¹?‹ ?˜ ?•™? ?? B?…?‹ˆ?‹¤.");
		} else if (score >= 70) {
			System.out.println("?‹¹?‹ ?˜ ?•™? ?? C?…?‹ˆ?‹¤.");
		} else if (score >= 60) {
			System.out.println("?‹¹?‹ ?˜ ?•™? ?? D?…?‹ˆ?‹¤.");
		} else {
			System.out.println("?‹¹?‹ ?˜ ?•™? ?? F?…?‹ˆ?‹¤.");
			System.out.println("?‹¹?‹ ?? ?¬?ˆ˜ê°? ???ƒ??…?‹ˆ?‹¤.");
		}
		
		scanner.close();
	}

}
