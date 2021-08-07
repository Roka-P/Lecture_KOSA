package java0716;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class _1314ChoiceFormatExample2 {

	public static void main(String[] args) {

		MessageFormat msgForm = new MessageFormat("{0}의 바구니에 사과가 {1}");
		
		double[] appleLimits = {0, 1, 2};
		String[] applePart = {"없습니다.", "1개 있습니다.", "{1, number}개 있습니다."};
		ChoiceFormat appleForm = new ChoiceFormat(appleLimits, applePart);
		
		msgForm.setFormatByArgumentIndex(1, appleForm);
		
		System.out.println(msgForm.format(new Object[] {"그", new Long(2)}));
		System.out.println(msgForm.format(new Object[] {"그녀", new Long(0)}));
		System.out.println(msgForm.format(new Object[] {"나", new Long(1)}));
		System.out.println(msgForm.format(new Object[] {"너", new Long(5)}));
	}

}
