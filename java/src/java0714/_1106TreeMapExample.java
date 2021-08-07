package java0714;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _1106TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> accounts = new TreeMap<>();
		
		accounts.put("홍길동", 10000);
		accounts.put("이순신", 50000);
		accounts.put("정준수", 90000);
		accounts.put("허현수", 70000);
		
		System.out.println(accounts);
		
		System.out.println("* key를 이용한 value 조회");
		System.out.println("허현수 : " + accounts.get("허현수"));
		
		System.out.println("* entrySet을 이용한 맵 데이터 출력");
		Set<Map.Entry<String, Integer>> entries = accounts.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("* keySet을 이용한 맵 데이터 출력");
		Set<String> keys = accounts.keySet();
		for(String key : keys) {
			System.out.println(key + " :: " + accounts.get(key));
		}
	}
}
