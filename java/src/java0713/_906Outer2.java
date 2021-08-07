package java0713;

public class _906Outer2 {
	private int data;
		public class Inner2 {
			public void doIt() {
				data++;
				System.out.println("Inner 클래스의 메서드 호출됨");
				System.out.println("data값은 : " + data);
			}
		}
}
