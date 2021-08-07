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
			System.out.println("URL 주소가 형식에 맞지 않습니다.");
			return;
		}

		InputStream is = null;
		try {
			is = url.openStream();
		} catch (IOException e) {
			System.out.println("주소를 열지 못했습니다.");
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
			
			System.out.println(file + "파일을 열어보세요.");
		} catch (FileNotFoundException e){
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		} finally {
			if(fos != null)
				try {fos.close();} catch (IOException e) {}
		}
	}

}
