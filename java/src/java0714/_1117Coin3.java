package java0714;

public enum _1117Coin3 {
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25);
	
	private int coinValue;
	
	int getValue() {
		return coinValue;
	}
	
	_1117Coin3(int value) {
		coinValue = value;
	}
}
