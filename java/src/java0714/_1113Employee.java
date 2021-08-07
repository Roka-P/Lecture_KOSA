package java0714;

public class _1113Employee {
	String name;
	int salary;
	
	public _1113Employee() {}
	
	public _1113Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
}
