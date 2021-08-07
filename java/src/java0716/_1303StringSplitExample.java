package java0716;

import java.util.StringTokenizer;

public class _1303StringSplitExample {

	public static void main(String[] args) {
		String accessLog = "2017,03,11,,,USER123,GROUP1";
		System.out.println("*****Tokenizer");
		StringTokenizer accessTokens = new StringTokenizer(accessLog, ",");
		System.out.println("토크 수 : " + accessTokens.countTokens());
		while (accessTokens.hasMoreTokens()) {
			System.out.println(accessTokens.nextToken());
		}

		System.out.println("*****split");
		String[] splits = accessLog.split(",");
		System.out.println("배열 개수 : " + splits.length);
		for(String str : splits) {
			System.out.println(str);
		}
	
		System.out.println("*****split");
		String[] splits2 = accessLog.split(",", 3);
		System.out.println("배열 개수 : " + splits2.length);
		for(String str : splits2) {
			System.out.println(str);
		}
	}

}
