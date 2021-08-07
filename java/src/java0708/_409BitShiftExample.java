package java0708;

public class _409BitShiftExample {

	public static void main(String[] args) {
		int pixel = 0xFFF07896; // Alpha : FF, Red : F0, Green : 78, Blue : 96
		
		int blue = pixel & 0x000000FF;
		System.out.printf("16진수 %x, 10진수 %d \n", blue, blue);
		
		int red = (pixel & 0x00FF0000) >> 16;
		System.out.printf("16진수 %x, 10진수 %d \n", red, red);
		
	}

}
