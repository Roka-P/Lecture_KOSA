package java0714;

public enum _1116Coin2 {
	PENNY {
		int getValue() {
			return 1;
		}
	},
	NICKEL {
		int getValue() {
			return 5;
		}
	},
	DIME {
		int getValue() {
			return 10;
		}
	},
	QUARTER {
		int getValue() {
			return 25;
		}
	};
	
	abstract int getValue();
}
