package java0714;

public class _1003CatchExample {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 100);
		int b = (int)(Math.random() * 4);
		try {
			System.out.printf("a=%d, b=%d, result=%d\n", a, b, divide(a,b));
			doSomething(a);
		} catch (ArithmeticException ae) {
			System.out.println("0���� �������� �ϰ� �ֽ��ϴ�.");
			System.out.println(ae.getMessage());
		} catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
			System.out.println("���� �߻����� : " + e.getMessage());
		}
	}

	public static void doSomething(int a) throws Exception {
		if (a>50) {
			throw new Exception("a���� 50���� Ů�ϴ�");
		}
		System.out.println("50%Ȯ���� ����˴ϴ�.");
	}

	public static int divide(int a, int b) {
		return a/b;
	}

}
