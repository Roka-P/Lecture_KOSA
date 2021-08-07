package java0712;

public class _805Teacher extends _805Person{
//	public String name;
//	public int age;
	public String subject;
	
	public _805Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	@Override
	public String getDetails() {
		return super.getDetails()  + "\t°ú¸ñ: " + subject;
	}
}
