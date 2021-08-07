package java0716;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class _1312DateFormatExample {
	
	static void displayDateAndTime(String format, Locale locale, Date date) {
		DateFormat df = new SimpleDateFormat(format, locale);
		System.out.format("%s : %s%n", format, df.format(date));
	}
	
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		Locale koLocale = new Locale("ko","KR");
		TimeZone tz = TimeZone.getTimeZone("Asia/Seoul");
		System.out.println(tz.getDisplayName() + " : " + date);
		displayDateAndTime("yyyy.MM.dd G 'at' HH:mm:ss z", koLocale, date);
		displayDateAndTime("EEE, MMM d, ''yy" , koLocale, date);
		displayDateAndTime("h:mm a", koLocale, date);
		displayDateAndTime("hh 'o''clock' a, zzzz", koLocale, date);
		displayDateAndTime("K:mm a, z", koLocale, date);
		displayDateAndTime("yyyyy.MMMMM.dd GGG hh:mm aaa", koLocale, date);
		displayDateAndTime("EEE, d MMM yyy HH:mm:ss Z", koLocale, date);
		displayDateAndTime("yyMMddHHmmssZ", koLocale, date);
		displayDateAndTime("yyyy-MM-dd'T'HH:mm:ss.SSSZ", koLocale, date);
		displayDateAndTime("yyyy-MM-dd'T' HH:mm:ss.SSSXXX", koLocale, date);
		displayDateAndTime("YYYY-'W'ww-u", koLocale, date);
		
		System.out.println();
		Locale usLocale = new Locale("en","US");
		System.out.println(tz.getDisplayName() + " : " + date);
		displayDateAndTime("yyyy.MM.dd G 'at' HH:mm:ss z", usLocale, date);
		displayDateAndTime("EEE, MMM d, ''yy" , usLocale, date);
		displayDateAndTime("h:mm a", usLocale, date);
		displayDateAndTime("hh 'o''clock' a, zzzz", usLocale, date);
		displayDateAndTime("K:mm a, z", usLocale, date);
		displayDateAndTime("yyyyy.MMMMM.dd GGG hh:mm aaa", usLocale, date);
		displayDateAndTime("EEE, d MMM yyy HH:mm:ss Z", usLocale, date);
		displayDateAndTime("yyMMddHHmmssZ", usLocale, date);
		displayDateAndTime("yyyy-MM-dd'T'HH:mm:ss.SSSZ", usLocale, date);
		displayDateAndTime("yyyy-MM-dd'T' HH:mm:ss.SSSXXX", usLocale, date);
		displayDateAndTime("YYYY-'W'ww-u", usLocale, date);
		
	}

}
