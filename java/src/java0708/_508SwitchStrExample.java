package java0708;

public class _508SwitchStrExample {

	public static void main(String[] args) {
		String[] hello = {"?��?��?��?��?��", "?���?", "?��?��?��", "곤니찌�?"};
		
		int i = (int)(Math.random()*hello.length);
		System.out.println("?��?��?�� ?��?�� : " + hello[i]);
		
		switch(hello[i]) {
			case "?��?��?��?��?��" :
				System.out.println("?���??��?��?��?��.");
				break;
			case "?���?" :
				System.out.println("?��?��?��?��?��.");
				break;
			case "?��?��?��" :
				System.out.println("중국?��?��?��?��.");
				break;
			case "곤니찌�?" :
				System.out.println("?��본어?��?��?��.");
				break;
			default :
				System.out.println("!?!?!?!?!?!?");
				break;
				
		}
	}

}
