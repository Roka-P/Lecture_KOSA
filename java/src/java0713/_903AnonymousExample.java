package java0713;

import java.awt.*;
import java.awt.event.*;

public class _903AnonymousExample {
	private Frame f;
	
	public _903AnonymousExample() {
		f = new Frame("Anonymous 클래스 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		_903AnonymousExample ae = new _903AnonymousExample();
		ae.launchFrame();
		}
	}
