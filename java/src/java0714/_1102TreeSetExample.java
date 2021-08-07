package java0714;

import java.util.*;

public class _1102TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("computer");
		
		for(String str : ts) {
			System.out.print(str + "\t");
		}
	}

}
