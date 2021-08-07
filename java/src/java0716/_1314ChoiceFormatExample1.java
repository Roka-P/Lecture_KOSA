package java0716;

import java.text.ChoiceFormat;
import java.text.ParsePosition;

public class _1314ChoiceFormatExample1 {

	public static void main(String[] args) {
		double[] limits = {1,2,3,4,5,6,7};
		String[] dayOfWeekNames = {"Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
		ChoiceFormat choiceForm = new ChoiceFormat(limits, dayOfWeekNames);
		ParsePosition status = new ParsePosition(0);
		for (double i = 0.0; i <=8.0; ++i) {
			status.setIndex(0);
			System.out.println(i + " -> " + choiceForm.format(i) + " -> " + choiceForm.parse(choiceForm.format(i),status));
		}

	}

}
