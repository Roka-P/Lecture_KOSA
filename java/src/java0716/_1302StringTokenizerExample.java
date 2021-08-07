package java0716;

import java.util.*;

public class _1302StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("this is a test");
		System.out.println("*****Tokenizing by space");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String accessLog = "2017.03.11,SAT,/board?bbsno=30,USER123;GROUP1;";
		
		StringTokenizer accessTokens1 = new StringTokenizer(accessLog, ",");
		System.out.println("*****Tokenizing by ,");
		while (accessTokens1.hasMoreTokens()) {
			System.out.println(accessTokens1.nextToken());
		}
		
		System.out.println("*****Tokenizing by ,");
		StringTokenizer accessTokens5 = new StringTokenizer(accessLog);
		while (accessTokens5.hasMoreTokens()) {
			System.out.println(accessTokens5.nextToken());
		}
		
		System.out.println("*****Tokenizing by .,;");
		StringTokenizer accessTokens2 = new StringTokenizer(accessLog, ".,;");
		while (accessTokens2.hasMoreTokens()) {
			System.out.println(accessTokens2.nextToken());
		}
		
		System.out.println("*****Tokenizing by .,;/?");
		StringTokenizer accessTokens3 = new StringTokenizer(accessLog, ".,;/?");
		while (accessTokens3.hasMoreTokens()) {
			System.out.println(accessTokens3.nextToken());
		}
		
		System.out.println("*****Tokenizing by ,(구분자도 토큰포함)");
		StringTokenizer accessTokens4 = new StringTokenizer(accessLog, ",", true);
		while (accessTokens4.hasMoreTokens()) {
			System.out.println(accessTokens4.nextToken());
		}
		
		
	}

}
