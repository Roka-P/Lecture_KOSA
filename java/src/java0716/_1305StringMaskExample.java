package java0716;

public class _1305StringMaskExample {

	public static void main(String[] args) {
		String custInfo = "ȫ�浿,����,010-1234-5678,30,M";

		custInfo = custInfo.replaceAll("\\d{3}-\\d{4}-\\d{4}", "***-****-****");
		System.out.println(custInfo);
	}

}
