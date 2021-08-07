package java0713;

public class _907Outer3 {
	private int data = 10;
	
	public class Inner3 {
		private int data=20;
		
		public void doIt(int data) {
			System.out.println(data);
			System.out.println(this.data);
			System.out.println(_907Outer3.this.data);
		}
	}

}
