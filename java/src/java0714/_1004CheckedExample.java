package java0714;

import java.io.IOException;

public class _1004CheckedExample {

	public static void main(String[] args) {
		System.out.println("���� �Է¹޴� ���α׷��Դϴ�.");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�Է��� ���ڿ��� : ");
		System.out.println(new String(data).trim());
	}

}
