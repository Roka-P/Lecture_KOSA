package java0714;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _1106TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new TreeMap<>();
		
		accounts.put("ȫ�浿", 10000);
		accounts.put("�̼���", 50000);
		accounts.put("���ؼ�", 90000);
		accounts.put("������", 70000);
		
		System.out.println(accounts);
		
		System.out.println("* key�� �̿��� value ��ȸ");
		System.out.println("������ : " + accounts.get("������"));
		
		System.out.println("* entrySet�� �̿��� �� ������ ���");
		Set<Map.Entry<String, Integer>> entries = accounts.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("* keySet�� �̿��� �� ������ ���");
		Set<String> keys = accounts.keySet();
		for(String key : keys) {
			System.out.println(key + " :: " + accounts.get(key));
		}
	}
}
