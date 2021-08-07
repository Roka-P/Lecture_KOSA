package java0713;

public class _810Company {
	private int data;
	
	private static _810Company com = new _810Company();
	private _810Company() {
		this.data = 20;
	}
	public static _810Company getCompany() {
		return com;
	}
}
