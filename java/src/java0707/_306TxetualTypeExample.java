package java0707;

public class _306TxetualTypeExample {

	public static void main(String[] args) {
		char one = 'A';
		char two = '\t'; // escape words
		char three = '\uAC00'; // ='��' unichord
		String four = "Hello";
		String five = "\uD604\uC218";
		String six = "dream";
		System.out.printf("%c,%c,%c,%s,%s,%s", one, two, three, four, five, six);
	}
	
}
