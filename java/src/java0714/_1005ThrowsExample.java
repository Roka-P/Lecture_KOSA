package java0714;

public class _1005ThrowsExample {
	
	static String[] greetings = {"�ȳ��ϼ���.", "�ݰ����ϴ�.", "�� ������."};
	
	public static void main(String[] args) {
		int i = (int)(Math.random()*4);

		try {
			doIt(i);
		} catch(Exception e) {
			System.out.println("main���� ����ó�� �����ϴ�.");
		}
	}

	public static void doIt(int index) throws ArrayIndexOutOfBoundsException {
		System.out.println(greetings[index]);
		
	}
	
	
}
