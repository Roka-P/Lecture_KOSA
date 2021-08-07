package java0715;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _1203DataIOExample {

	public static void main(String[] args) {
		String outFile = "employee.txt";
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(outFile);
			dos = new DataOutputStream(fos);
			dos.writeUTF("������");
			dos.writeUTF("41456");
			dos.writeInt(30);
			dos.writeUTF("���ؼ�");
			dos.writeUTF("41457");
			dos.writeInt(31);
			System.out.println("�����Ͱ� ����Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (dos != null)
				try {dos.close();} catch (IOException e) {}
		}
		
		System.out.println("����� �����͸� �ҷ��ɴϴ�");
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(outFile);
			dis = new DataInputStream(fis);
			System.out.println("�̸� : " + dis.readUTF());
			System.out.println("��� : " + dis.readUTF());
			System.out.println("���� : " + dis.readInt());
			System.out.println("�̸� : " + dis.readUTF());
			System.out.println("��� : " + dis.readUTF());
			System.out.println("���� : " + dis.readInt());
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (dis != null)
				try {dis.close();} catch (IOException e) {}
		}
	}

}
