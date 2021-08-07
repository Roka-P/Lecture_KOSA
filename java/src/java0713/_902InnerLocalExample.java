package java0713;

import java.awt.*;
import java.awt.event.*;

public class _902InnerLocalExample {
	private Frame f;
	
	public _902InnerLocalExample() {
		f = new Frame("Local 클래스 예제");
	}
	
	public void launchFrame() {
		class MyWindowAdapter extends WindowAdapter {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		_902InnerLocalExample ile = new _902InnerLocalExample();
		ile.launchFrame();
		}
	}
