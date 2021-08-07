package java0714;

public enum _1115Coin {
	PENNY, 
	NICKEL,
	DIME,
	QUARTER;
	
	int getValue() {
		switch (this) {
			case PENNY : return 1;
			case NICKEL : return 5;
			case DIME : return 10;
			case QUARTER : return 25;
			default : return 0;
		}
	}
}
