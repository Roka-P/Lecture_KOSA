package java0712;

public class _701PenInstanceExample {

	public static void main(String[] args) {
		_701Pen redPen = new _701Pen();
		redPen.color = "����";
		redPen.write(3);
		
		_701Pen bluePen = new _701Pen("�Ķ�", 900);
		redPen.write(3);
		
		_701Pen yellowPen = new _701Pen(800, "���");
		redPen.write(1);
		
	}

}