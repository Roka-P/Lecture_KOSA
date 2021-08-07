package java0716;

import java.text.MessageFormat;
import java.util.Date;

public class _1313MessageFormatExample {
	public static void main(String[] args) {
		new _1313MessageFormatExample();
	}
	public _1313MessageFormatExample() {
		Object[] args = {"foo", "bar", new Long(99)};
		MessageFormat mf = new MessageFormat("1:{0} 2:{1} 3:{2}");
		System.out.println(mf.format(args));
		
		int meetingTime = 10;
		String event = "��ȸ�ǽǿ��� ���� �ɻ�";
		
		String result = MessageFormat.format("����({0,date}) {1, number}�ÿ� {2}�� �ֽ��ϴ�.", new Date(), meetingTime, event);
		System.out.println(result);
	}
}
