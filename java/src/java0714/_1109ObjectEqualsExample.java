package java0714;

import java.util.HashSet;
import java.util.Set;

public class _1109ObjectEqualsExample {

	public static void main(String[] args) {
		_1109Dog d1 = new _1109Dog("1234567890", "�ٵ���");
		_1109Dog d2 = new _1109Dog("1234567890", "�ٵ���");
		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		System.out.println(d1);
		
		Set<_1109Dog> set =new HashSet<_1109Dog>();
		System.out.println("d1 ��ü�� set�� ���� : " + set.add(d1));
		System.out.println("d2 ��ü�� set�� ���� : " + set.add(d2));
	}

}
