package java0714;

public class _1115EnumBasicExample {

	public static void main(String[] args) {
		_1115Coin coin = _1115Coin.DIME;
		
		switch(coin) {
		case PENNY :
			System.out.println("1��Ʈ �����Դϴ�.");
			break;
		case NICKEL :
			System.out.println("5��Ʈ �����Դϴ�.");
			break;
		case DIME :
			System.out.println("10��Ʈ �����Դϴ�.");
			break;
		case QUARTER :
			System.out.println("25��Ʈ �����Դϴ�.");
			break;
		default :
			break;
		}

	}

}
