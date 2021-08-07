package java0708;

public class _422DoWhileExample {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		do {
			sum = sum + i;
			i++;
		}while (i <= 10);
		
		System.out.println("합 : " + sum);
	}

}
