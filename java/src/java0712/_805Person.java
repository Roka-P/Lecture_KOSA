package java0712;

public class _805Person {
	public String name;
	public int age;
	
	public _805Person(String name, int age) {
		this.name = name;
		this.age = age;
	}     //�����ڸ� ������ �⺻�����ڰ� ����
	
	public _805Person() {
		this("����", 1); // ()���� Ŭ�������� ������ ����
	} //�⺻ ������ ���� �������־�� ��
	
	public String getDetails() {
		return "�̸�: " + name + "\t����: " + age;
	}
}
