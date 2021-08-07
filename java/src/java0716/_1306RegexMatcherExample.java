package java0716;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1306RegexMatcherExample {

	public static void main(String[] args) {
		String custInfo = 
				"ȫ�浿�� 30���̸� ����� �������� �����մϴ�."
				+"���� �� ��ȭ��ȣ�� 02-234-5678�̸� "
				+"�޴��� ��ȣ�� 011-234-5678�Դϴ�.";
		
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		Pattern r = Pattern.compile(pattern);
		
		Matcher m = r.matcher(custInfo);
		int cnt = 0;
		while(m.find()) {
			cnt++;
			System.out.println("ã�� ��ġ : " + m.start() +"\t");
			System.out.println("��ȭ��ȣ : " + m.group());
		}
		System.out.println("�߰ߵ� ��ȭ��ȣ �� : " + cnt);
	}

}
