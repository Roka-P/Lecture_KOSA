package java0712;

public class _805Student extends _805Person{
//	public String name;
//	public int age;
	public String studentId;
	
	public _805Student(String name, int age, String studentId) {
	super(name, age);
	this.studentId = studentId;
}

	@Override
	public String getDetails() {
		return super.getDetails() + "\tÇĞ¹ø: " + studentId;
	}
}
