package java0712;

public class _807PolymorphicExample {

	public static void main(String[] args) {
//		int a = 3.5;
//		_706Person p = new _706Person("ȫ�浿", 20);
		_805Person p;
//		p = new _706Student("ȫ�浿", 20, "123123123");
		p = new _805Teacher("ȫ�漭", 25, "JAVA");
		System.out.println(p.getDetails()); // Virtual Method Invocation
		
		int[] intArr = new int[5];
		intArr[0] = 10;
//		intArr[1] = 3.5;
//		intArr[2] = false;
		_805Person[] pArr = new _805Person[4]; //��������
		pArr[0] = new _805Person("ȫ�浿", 25);
		pArr[1] = new _805Student("ȫ�漭", 25, "123123");
		pArr[2] = new _805Teacher("ȫ�泲", 30, "�ڹ�");
		pArr[3] = new _802Employee("ȫ���", 35, "����ó");
		
		Object[] objArr = new Object[5];
		objArr[0] = new _805Person("ȫ�浿", 25);
		objArr[1] = new _805Student("ȫ�漭", 25, "123123");
//		objArr[2] = new Integer(100); // ���� �Ⱦ�
//		Integer intData = new Integer(100); 
		// Wrapper class :
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean
//		int a = new Integer(100); // Autoboxing 5������ �߰���
		// 9�������� Wrapper class deprecated
		
		_805Person p1 = new _805Person("ȫ�浿", 25);
		printPersonInfo(p1);
		_805Student s1 = new _805Student("ȫ�漭", 25, "123123");
		printPersonInfo(s1); // Polymorphic argument
	}
	public static void printPersonInfo(_805Person p) {
		if(p instanceof _805Student) {
			System.out.println("*************Student Info*************");
		} else if(p instanceof _805Teacher) {
			System.out.println("*************Teacher Info*************");			
		} else if(p instanceof _802Employee) {
			System.out.println("*************Employee Info*************");
		} else {
			System.out.println("*************Person  Info*************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("**************************************");
 	}
}
