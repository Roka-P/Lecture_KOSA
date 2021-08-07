package java0715;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _1201NodeStreamExample {

	public static void main(String[] args) {
		FileReader input = null;
		FileWriter output = null;
		try {
			String inFile = "in.txt";
			String outFile = "out.txt";
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			
			char[] buffer = new char[128];
			
			int readCount = 0;
			do {
				readCount = input.read(buffer);
				if (readCount >= 0) {
					output.write(buffer, 0, readCount);
				}
			}while (readCount != -1);
				System.out.println("파일이 복사되었습니다.");				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (input != null)
					try {input.close();} catch (IOException e) {}
				if (output != null)
					try {input.close();} catch (IOException e) {}
			}
		}
 	}
