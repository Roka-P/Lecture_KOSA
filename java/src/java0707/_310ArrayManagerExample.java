package java0707;
public class _310ArrayManagerExample {
	int[] intArr = new int[100];
	int index = -1;
	int count = 0;
	
	public void add(int data) {
		intArr[count] = data;
		count++;
	}
	
	public void printAll() {
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + "\t");
		}
		System.out.println();
	}
	
	public int indexOf(int data) {
		for (int i = 0; i < count; i++) {
			if(intArr[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	public void update(int index, int data) {
		intArr[index] = data;
	}
	
	public int delete(int index) {
		int deleteData = intArr[index];
		for(int i = index; i <count-1; i++) {
			intArr[i] = intArr[i+1];
		}
		count --;
		return deleteData;
	}
	
	public void insert(int index, int data) {
		for( int i=count; i>index; i--) {
			intArr[i] = intArr[i-1];
		}
		intArr[index] = data;
		count++;
	}
	
	public static void main(String[] args) {
		_310ArrayManagerExample ex = new _310ArrayManagerExample();
		ex.add(10); ex.add(20); ex.add(30);
		ex.printAll();
		
		System.out.println("������ 20�� index : " + ex.indexOf(20));
		
		ex.update(1, 40);
		ex.printAll();
		
		System.out.println(ex.delete(1) + "�� �����մϴ�.");
		ex.printAll();
		
		ex.insert(1,50);
		ex.printAll();
		ex.insert(2,60);
		ex.printAll();
	}

}
