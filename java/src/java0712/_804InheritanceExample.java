package java0712;

public class _804InheritanceExample {

	public static void main(String[] args) {
		_805Person p = new _805Person();
		p.name = "È«±æµ¿";
		p.age = 29;
		System.out.println(p.getDetails());
		
		_805Student s = new _805Student("È«±æ¼­", 24, "D3123");
		System.out.println(s.getDetails());
		
		_805Teacher t = new _805Teacher("È«±æ³²", 22, "ÀÚ¹Ù");
		System.out.println(t.getDetails());
		
		_802Employee e = new _802Employee("È«±æºÏ", 40, "SW");
		System.out.println(e.getDetails());
	}

}
