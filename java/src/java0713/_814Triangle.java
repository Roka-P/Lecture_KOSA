package java0713;

public class _814Triangle implements _814Shape {
	private int width;
	private int height;
	public _814Triangle(int width, int height ) {
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height/2;
	}

}
