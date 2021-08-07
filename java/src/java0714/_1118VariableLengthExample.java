package java0714;

public class _1118VariableLengthExample {

	public static void main(String[] args) {
		log("Hello");
		log("VariableLengthExample", "Hello");
		log("a", "b", "c");
		log();
	}
	
	public static void log(String...msg) {
		System.out.println("·Î±× : ");
		for (String message : msg) {
			System.out.print(message + ", ");
		}
		System.out.println();
	}
}
