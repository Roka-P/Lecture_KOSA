package java0713;

public class _910InnerModifierExample {

	public static void main(String[] args) {
		_909Outer5 out5 = new _909Outer5();
		_909Outer5.Inner1 in1 = out5.new Inner1();
		in1.doIt();
		_909Outer5.Inner2 in2 = out5.new Inner2();
		in2.doIt();
		_909Outer5.Inner3 in3 = out5.new Inner3();
		in3.doIt();
//		_909Outer5.Inner4 in4 = out5.new Inner4(); Error
//  		in4.doIt();
		_909Outer5.Inner5.doIt();
	}

}
