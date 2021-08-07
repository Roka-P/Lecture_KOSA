package java0716;

import java.util.Calendar;
import java.util.TimeZone;

public class _1308CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.print(TimeZone.getDefault().getID() + " : ");
		System.out.print(cal.get(Calendar.YEAR) + "��");
		System.out.print(cal.get(Calendar.MONTH)+1 + "��");
		System.out.print(cal.get(Calendar.DATE) + "��");
		System.out.print(cal.get(Calendar.AM_PM) == 0? "����" : "����");
		System.out.print(cal.get(Calendar.HOUR) + "��");
		System.out.print(cal.get(Calendar.MINUTE) + "��");
		System.out.print(cal.get(Calendar.SECOND) + "��");
		System.out.print(cal.getTimeInMillis());
		
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		cal = Calendar.getInstance(timezone);
		System.out.print(TimeZone.getDefault().getID() + " : ");
		System.out.print(cal.get(Calendar.YEAR) + "��");
		System.out.print(cal.get(Calendar.MONTH)+1 + "��");
		System.out.print(cal.get(Calendar.DATE) + "��");
		System.out.print(cal.get(Calendar.AM_PM) == 0? "����" : "����");
		System.out.print(cal.get(Calendar.HOUR) + "��");
		System.out.print(cal.get(Calendar.MINUTE) + "��");
		System.out.print(cal.get(Calendar.SECOND) + "��");
		System.out.print(cal.getTimeInMillis());
	}

}
