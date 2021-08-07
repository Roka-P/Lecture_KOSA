package java0716;

public class _1301StringExample {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println(str.hashCode());
		str = str.concat("123");
		System.out.println(str.hashCode());
		System.out.println("-------------------------");
		
		StringBuffer strBuf = new StringBuffer("abc");
		System.out.println(strBuf.hashCode());
		strBuf = strBuf.append("123");
		System.out.println(strBuf.hashCode());
		System.out.println("-------------------------");
		
		StringBuilder strBld = new StringBuilder("abc");
		System.out.println(strBld.hashCode());
		strBld = strBld.append("123");
		System.out.println(strBld.hashCode());
	}

}
