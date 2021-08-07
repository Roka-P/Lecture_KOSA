package java0716;

import java.util.Random;

public class _1315RandomClassExample {

	public static void main(String[] args) {
		int numTests = 10;
		Random random = new Random();
		for (int i = 0; i<numTests; i++) {
			int randomInt = random.nextInt(100);
			System.out.format("테스트 %2d, 발생 난수 %d\n", i+1, randomInt);
		}

	}

}
