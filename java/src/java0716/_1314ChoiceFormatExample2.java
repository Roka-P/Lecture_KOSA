package java0716;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class _1314ChoiceFormatExample2 {

	public static void main(String[] args) {

		MessageFormat msgForm = new MessageFormat("{0}�� �ٱ��Ͽ� ����� {1}");
		
		double[] appleLimits = {0, 1, 2};
		String[] applePart = {"�����ϴ�.", "1�� �ֽ��ϴ�.", "{1, number}�� �ֽ��ϴ�."};
		ChoiceFormat appleForm = new ChoiceFormat(appleLimits, applePart);
		
		msgForm.setFormatByArgumentIndex(1, appleForm);
		
		System.out.println(msgForm.format(new Object[] {"��", new Long(2)}));
		System.out.println(msgForm.format(new Object[] {"�׳�", new Long(0)}));
		System.out.println(msgForm.format(new Object[] {"��", new Long(1)}));
		System.out.println(msgForm.format(new Object[] {"��", new Long(5)}));
	}

}
