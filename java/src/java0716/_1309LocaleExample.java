package java0716;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class _1309LocaleExample {

	public static void localizedFromat(String pattern, double value, Locale loc) {
		NumberFormat nf = NumberFormat.getNumberInstance(loc);
		DecimalFormat df = (DecimalFormat)nf;
		df.applyPattern(pattern);
		String output = df.format(value);
		System.out.println(pattern + " " + output + " " + loc.toString());
	}
	public static void main(String[] args) {
		Locale locale = new Locale("ko","KR");
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		
		Locale locale2 = new Locale("en","US");
		System.out.println(locale2.getLanguage());
		System.out.println(locale2.getCountry());
		System.out.println(locale2.getDisplayCountry());
		
		System.out.println();
		Locale[] locales = {
				new Locale("en","US"),
				new Locale("de","DE"),
				new Locale("fr","FR"),
				new Locale("ko","KR")
		};
		
		for (int i = 0; i < locales.length; i++) {
			localizedFromat("###,###.###", 123456.789, locales[i]);
		}
	}
	

}
