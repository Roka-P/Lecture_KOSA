package java0713;

public class _816InterfaceImplExample {
	public static void main(String[] args) {
		_816ToDo todo = new _816ToDo();
		_816IToDo3 itodo3 = todo;
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4(); Error
		_816IToDo4 itodo4 = todo;
		itodo4.m4();
	}
}
