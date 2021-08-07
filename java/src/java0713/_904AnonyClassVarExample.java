package java0713;

import java.awt.*;
import java.awt.event.*;

public class _904AnonyClassVarExample {
	private Frame f;
	
	public _904AnonyClassVarExample() {
		f = new Frame("Anonymous 클래스 예제");
	}
	
	WindowListener handler = new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	};
	
	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		_904AnonyClassVarExample ae = new _904AnonyClassVarExample();
		ae.launchFrame();
		}
	}
