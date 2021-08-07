package java0713;

public class _811FinalRefVarExample {
	final int MY_VALUE = 7;
	
	public void go() {
//		MY_VALUE =10; Error
		System.out.println(MY_VALUE);
	}
	
	public static void main(String[] args) {
		_811FinalRefVarExample fv = new _811FinalRefVarExample();
		fv.go();
	}

}
