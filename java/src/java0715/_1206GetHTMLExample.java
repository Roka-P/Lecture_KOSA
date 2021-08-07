package java0715;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class _1206GetHTMLExample {

	public static void main(String[] args) {
		String urlStr = "http://www.javaspecialist.co.kr/";
		
		String file = "html.txt";
		byte[] inputString = new byte[1024];
		
		URL url = null;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			System.out.println("URL �ּҰ� ���Ŀ� ���� �ʽ��ϴ�.");
			return;
		}

		InputStream is = null;
		try {
			is = url.openStream();
		} catch (IOException e) {
			System.out.println("�ּҸ� ���� ���߽��ϴ�.");
			return;
		}
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			while(is.read(inputString, 0, inputString.length) != -1) {
				fos.write(inputString);
			}
			
			System.out.println("Path : " + url.getPath());
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Port : " + url.getPort());
			System.out.println("DefaultProt : " + url.getDefaultPort());
			System.out.println("File : " + url.getFile());
			
			System.out.println(file + "������ �������.");
		} catch (FileNotFoundException e){
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		} finally {
			if(fos != null)
				try {fos.close();} catch (IOException e) {}
		}
	}

}
