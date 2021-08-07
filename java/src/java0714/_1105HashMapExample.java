package java0714;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1105HashMapExample {

	public static void main(String[] args) {
		Map maps = new HashMap();
		
		String s1 = new String("ȫ�浿");
		maps.put("name", s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);
		
		System.out.println("* key�� �̿��� value �ʱ�ȭ");
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));
		
		System.out.println("* entrySet�� �̿��� �� ������ ���");
		//map���� ������Ʈ�� entrySet() �޼��带 �̿��Ͽ� ��ȸ
		Set<Map.Entry<String, Object>> entries = maps.entrySet();
		for(Map.Entry<String, Object> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("* keySet�� �̿��� �� ������ ���");
		//keySet() �޼���� map Ű�� ���Ϲް� get(key) �޼���� ��ȸ
		Set<String> keys = maps.keySet();
		for(String key : keys) {
			System.out.println(key + " :: " + maps.get(key));
		}
	}

}
