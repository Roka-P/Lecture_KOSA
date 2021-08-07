package java0712;

public class _802Employee extends _805Person{
//	public String name;
//	public int age;
	public String department;
	
	public _802Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	@Override
	public String getDetails() {
		return super.getDetails() + "\tºÎ¼­: " + department;
	}
}
