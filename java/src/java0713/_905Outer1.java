package java0713;

public class _905Outer1 {
	private int data;

	public class Inner1 {
		public void doIt() {
			data++;
			System.out.println("Inner Ŭ������ �޼��� ȣ���");
			System.out.println("data���� " + data);
		}
	}	
	
	public void testTheInner() {
		Inner1 in = new Inner1();
		in.doIt();
	}
	
	public static void main(String[] args) {
		_905Outer1 out = new _905Outer1();
		out.testTheInner();
	}
	
	
}
