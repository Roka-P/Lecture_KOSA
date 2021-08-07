package java0713;

public class _815InterfaceMemberExample implements _815ISomething {

	@Override
	public void run() {
//		MY_INT = 33; Error : final Variable
		System.out.println("run() : " + _815ISomething.A);
	}

	public static void main(String[] args) {
		System.out.println(_815ISomething.MY_INT);
		System.out.println(_815InterfaceMemberExample.MY_INT);
		_815ISomething is = new _815InterfaceMemberExample();
		is.run();
		_815InterfaceMemberExample im = new _815InterfaceMemberExample();
		im.run();
	}

}
