package java0714;

public class _1115EnumHiddenMethodExample {

	public static void main(String[] args) {
		_1115Coin[] coins = _1115Coin.values();
		
		System.out.println(coins);
		for (_1115Coin c : coins) {
			System.out.println(c.toString());
		}
		
		_1115Coin c1 = _1115Coin.valueOf("QUARTER");
		System.out.println("c1의 값 : " + c1);
		System.out.printf("c1의 값 : %s\n",c1);
	}

}
