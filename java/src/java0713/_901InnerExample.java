package java0713;

import java.awt.*;
import java.awt.event.*;

public class _901InnerExample {
	private Frame f;
	
	public _901InnerExample() {
		f = new Frame("Inner 클래스 예제");
	}
	
	public void launchFrame() {
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		_901InnerExample ie = new _901InnerExample();
		ie.launchFrame();
	}
	
	private class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
