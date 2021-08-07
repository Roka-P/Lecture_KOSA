package java0714;

public class _1115EnumMethodExample {

	public static void main(String[] args) {
		for(_1115Coin coin : _1115Coin.values()) {
			System.out.println(coin + "ÀÇ °ªÀº " + coin.getValue());
		}
	}

}
