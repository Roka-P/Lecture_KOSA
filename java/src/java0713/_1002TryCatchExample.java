package java0713;

public class _1002TryCatchExample {

	public static void main(String[] args) {
		int i = 0;
		String[] greetings = {"�ȳ��ϼ���","�ݰ����ϴ�.","�� ������."};
		while (i < 4) {
			try {
				System.out.println(greetings[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("���� �߻��߽��ϴ�.");
				System.out.println("���ܰ� �߻��� ������ " + e.getMessage());
				System.out.println("����ó���� �Ϸ��߽��ϴ�.");
			} finally {
				System.out.println("finally ���� �׻� ����˴ϴ�.");
			}
			i++;
		}
		System.out.println("������ �������Դϴ�.");
	}

}
