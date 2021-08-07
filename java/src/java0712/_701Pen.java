package java0712;

public class _701Pen {
	
	String color;
	int price;
	
	public _701Pen() {
		super();
	}
	
	public _701Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}

	public _701Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}


	public void write(int cnt) {
		int data = 10;
		for (int i = 0; i < cnt; i++ ) {
		System.out.println(color + "색으로 글을 씁니다.");
		}
		System.out.println(data);
		System.out.println("가격 :" + price);
	}	
}
