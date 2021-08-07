package java0707;

public class _311ArrayCopyExample {

	public static void main(String[] args) {
		
		int source[] = { 1, 2, 3, 4, 5, 6};
		int dest[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		System.arraycopy(source, 2, dest, 0, 3);
		
		for( int i = 0; i < dest.length; i++) {
			System.out.print(dest[i] + "\t");
		}

	}

}
