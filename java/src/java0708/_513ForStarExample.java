package java0708;

public class _513ForStarExample {

	public static void main(String[] args) {
		int lyr = 5;
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
///////////////////////////////////////////////////////
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < lyr-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
///////////////////////////////////////////////////////		
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < lyr-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
///////////////////////////////////////////////////////		
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < lyr-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
///////////////////////////////////////////////////////
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < lyr - i -1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
///////////////////////////////////////////////////////		
		for (int i = 0; i < lyr; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*(lyr-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();		
		
	}

}
