package java0713;

public class _811FinalLocalVarExample {
	
	public int data =100;
	
	public static void main(String[] args) {
		new _811FinalLocalVarExample().doIt("ȫ�浿");
	}
	
	public void doIt(final String name) {
		final int age = 30;
		
		class InnerLocal {
			public void InnerDoIt() {
				System.out.println("�ܺ�Ŭ������ ������� data" + data);
				System.out.println("�ܺ�Ŭ������ �Ķ���� ���� name : " + name);
				System.out.println("�ܺ�Ŭ������ �������� age : " + age);
			}
		}
		new InnerLocal().InnerDoIt();
	}
}