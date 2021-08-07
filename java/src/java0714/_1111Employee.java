package java0714;

public class _1111Employee implements Comparable<_1111Employee> {
	String name;
	int salary;
	
	public _1111Employee() {}
	
	public _1111Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
	
	public int compareTo(_1111Employee emp) {
		return this.name.compareTo(emp.name);
	}
}
