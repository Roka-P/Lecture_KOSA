package java0716;

import java.util.Calendar;
import java.util.TimeZone;

public class _1308CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print(TimeZone.getDefault().getID() + " : ");
		System.out.print(cal.get(Calendar.YEAR) + "년");
		System.out.print(cal.get(Calendar.MONTH)+1 + "월");
		System.out.print(cal.get(Calendar.DATE) + "일");
		System.out.print(cal.get(Calendar.AM_PM) == 0? "오전" : "오후");
		System.out.print(cal.get(Calendar.HOUR) + "시");
		System.out.print(cal.get(Calendar.MINUTE) + "분");
		System.out.print(cal.get(Calendar.SECOND) + "초");
		System.out.print(cal.getTimeInMillis());
		
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		cal = Calendar.getInstance(timezone);
		System.out.print(TimeZone.getDefault().getID() + " : ");
		System.out.print(cal.get(Calendar.YEAR) + "년");
		System.out.print(cal.get(Calendar.MONTH)+1 + "월");
		System.out.print(cal.get(Calendar.DATE) + "일");
		System.out.print(cal.get(Calendar.AM_PM) == 0? "오전" : "오후");
		System.out.print(cal.get(Calendar.HOUR) + "시");
		System.out.print(cal.get(Calendar.MINUTE) + "분");
		System.out.print(cal.get(Calendar.SECOND) + "초");
		System.out.print(cal.getTimeInMillis());
	}

}
