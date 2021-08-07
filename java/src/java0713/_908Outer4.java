package java0713;

public class _908Outer4 {
	private int data = 10;
	
	public Object makeTheInner(final int localData) {
		final int FINAL_LOCAL_DATA = 20;
		
		class MyInner4 {
			public String toString() {
				return ( "data=" + data + "\nlocalData=" + localData + "\nFINAL_LOCAL_DAT=" + FINAL_LOCAL_DATA );
			}
		}
		return new MyInner4();
	}
	
	public static void main(String[] args) {
		_908Outer4 out = new _908Outer4();
		Object in = out.makeTheInner(30);
		System.out.println(in);
	}
	
}
