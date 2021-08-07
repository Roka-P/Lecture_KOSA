package java0707;

public class _300Lotto {

	public static void main(String[] args) {
		int[] lotto = {0, 0, 0, 0, 0, 0}; 
		
		int index = 0; 
		while(true) {
			int rand = (int)(Math.random() * 45) + 1;//��ȣ    ��÷ 
			int i=0; 
			for(i=0; i<index; i++) { 
				if(rand == lotto[i]) {
					break; 
				}
			}
			if(index == i) {
				lotto[index++] = rand; 
			}
			if (index>5) break; 
		}
		
		for(int i=0; i <lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
	}
}
