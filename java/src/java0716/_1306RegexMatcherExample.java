package java0716;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1306RegexMatcherExample {

	public static void main(String[] args) {
		String custInfo = 
				"홍길동은 30세이며 서울시 강남구에 거주합니다."
				+"그의 집 전화번호는 02-234-5678이며 "
				+"휴대폰 번호는 011-234-5678입니다.";
		
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(custInfo);
		int cnt = 0;
		while(m.find()) {
			cnt++;
			System.out.println("찾은 위치 : " + m.start() +"\t");
			System.out.println("전화번호 : " + m.group());
		}
		System.out.println("발견된 전화번호 수 : " + cnt);
	}

}
