package java0712;

public class _805Person {
	public String name;
	public int age;
	
	public _805Person(String name, int age) {
		this.name = name;
		this.age = age;
	}     //생성자를 만들경우 기본생성자가 없음
	
	public _805Person() {
		this("무명씨", 1); // ()동일 클래스내의 생성자 참조
	} //기본 생성자 따로 정의해주어야 됨
	
	public String getDetails() {
		return "이름: " + name + "\t나이: " + age;
	}
}
