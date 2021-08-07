package java0716;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class _1311DecimalFormatExample {
	public static void customFormat(String pattern, double value) {
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.println(value + "\t" + pattern + "\t" + output);
	}
	
	public static void main(String[] args) {
		customFormat("###,###.###", 123456.789);
		customFormat("###.##", 123456.789);
		customFormat("000000.000", 12345.67);
		customFormat("$###,###.###", 12345.67);
		customFormat("\u00a5###,###.###", 12345.67);
		customFormat("\u20a9###,###.###", 12345.67);
		
		DecimalFormat deFormatter = (DecimalFormat)NumberFormat.getNumberInstance(new Locale("de", "DE"));
		deFormatter.applyPattern("###,###.###");
		String output = deFormatter.format(123.450);
		System.out.println("123.450 \t###,###.###\t" + output);
	}
	
}
