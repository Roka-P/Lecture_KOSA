package java0708;

import java.util.Scanner;

public class _505IfExample5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("?��?���? ?��?��?��?��?��.");
		int score = scanner.nextInt();
		
		System.out.println("?��?�� : " + score);
		if (score >= 90) {
			if (score > 100) {
				System.out.println("?���? ?��?��?�� ?��?��?��?��?��.");
			} else {
				System.out.println("?��?��?�� ?��?��?? A?��?��?��.");
			}
		} else if (score >= 80) {
			System.out.println("?��?��?�� ?��?��?? B?��?��?��.");
		} else if (score >= 70) {
			System.out.println("?��?��?�� ?��?��?? C?��?��?��.");
		} else if (score >= 60) {
			System.out.println("?��?��?�� ?��?��?? D?��?��?��.");
		} else {
			System.out.println("?��?��?�� ?��?��?? F?��?��?��.");
			System.out.println("?��?��?? ?��?���? ???��?��?��?��?��.");
		}
		
		scanner.close();
	}

}
