package java0713;

public abstract class _812Shape {
	private int x;
	private int y;
	
	public _812Shape() {}
	public _812Shape(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea();
	
	public String position() {
		return "[x=" + x + ", y=" + y + "]";
	}
	
}
