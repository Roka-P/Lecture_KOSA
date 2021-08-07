package java0714;

import java.io.IOException;

public class _1004CheckedExample {

	public static void main(String[] args) {
		System.out.println("값을 입력받는 프로그램입니다.");
		byte[] data = new byte[100];
		try {
			System.in.read(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력한 문자열은 : ");
		System.out.println(new String(data).trim());
	}

}
