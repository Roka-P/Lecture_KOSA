package java0714;

public class _1110Tiger implements Comparable<_1110Tiger> {
	String name;

	public _1110Tiger(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(_1110Tiger o) {
		return this.name.compareTo(o.name);
	}
}
