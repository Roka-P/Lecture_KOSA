package java0712;

public class _803TestMyDate {

	public static void main(String[] args) {
		_801MyDate myBirth = new _801MyDate();
//		myBirth.year = 1992;
//		myBirth.month = 02;
//		myBirth.day = 30; // can get wrong data
		
		myBirth.setYear(2000);
		myBirth.setMonth(12);
		myBirth.setDay(31); 
		
		System.out.println(myBirth);
	}

}
