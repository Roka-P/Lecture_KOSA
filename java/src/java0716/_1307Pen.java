package java0716;

import java.util.Objects;

public class _1307Pen {
	String id;
	String color;
	public _1307Pen(String id, String color) {
		this.id = id;
		this.color = color;
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_1307Pen other = (_1307Pen) obj;
		return Objects.equals(color, other.color) && Objects.equals(id, other.id);
	}
	
}
