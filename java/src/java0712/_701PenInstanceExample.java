package java0712;

public class _701PenInstanceExample {

	public static void main(String[] args) {
		_701Pen redPen = new _701Pen();
		redPen.color = "빨간";
		redPen.write(3);
		
		_701Pen bluePen = new _701Pen("파란", 900);
		redPen.write(3);
		
		_701Pen yellowPen = new _701Pen(800, "노란");
		redPen.write(1);
		
	}

}