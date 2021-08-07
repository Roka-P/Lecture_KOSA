package java0714;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1105HashMapExample {

	public static void main(String[] args) {
		Map maps = new HashMap();
		
		String s1 = new String("홍길동");
		maps.put("name", s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);
		
		System.out.println("* key를 이용한 value 초기화");
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));
		
		System.out.println("* entrySet를 이용한 맵 데이터 출력");
		//map안의 엘리먼트를 entrySet() 메서드를 이용하여 조회
		Set<Map.Entry<String, Object>> entries = maps.entrySet();
		for(Map.Entry<String, Object> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("* keySet을 이용한 맵 데이터 출력");
		//keySet() 메서드로 map 키를 리턴받고 get(key) 메서드로 조회
		Set<String> keys = maps.keySet();
		for(String key : keys) {
			System.out.println(key + " :: " + maps.get(key));
		}
	}

}
