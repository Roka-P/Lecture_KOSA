package java0713;

public class _900InnerExample {

	public static void main(String[] args) {
		_906Outer2 out2 = new _906Outer2();
		_906Outer2.Inner2 in2 = out2.new Inner2();
		in2.doIt();

		_907Outer3.Inner3 in3 = new _907Outer3().new Inner3();
		in3.doIt(30);
	}

}
