package java0714;

import java.util.Objects;

public class _1109Dog extends Object {
	String dogId;
	String dogName;
	
	public _1109Dog(String dogId, String dogName) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		return dogId + " : " + dogName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dogId, dogName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_1109Dog other = (_1109Dog) obj;
		return Objects.equals(dogId, other.dogId) && Objects.equals(dogName, other.dogName);
	}
	
	
}
