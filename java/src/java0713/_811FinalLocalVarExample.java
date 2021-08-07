package java0713;

public class _811FinalLocalVarExample {
	
	public int data =100;
	
	public static void main(String[] args) {
		new _811FinalLocalVarExample().doIt("홍길동");
	}
	
	public void doIt(final String name) {
		final int age = 30;
		
		class InnerLocal {
			public void InnerDoIt() {
				System.out.println("외부클래스의 멤버변수 data" + data);
				System.out.println("외부클래스의 파라미터 변수 name : " + name);
				System.out.println("외부클래스의 지역변수 age : " + age);
			}
		}
		new InnerLocal().InnerDoIt();
	}
}