package week9_swingContinuedLecture1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MultiListeners1 extends JFrame implements ActionListener {

	MultiListenerPanel panel = new MultiListenerPanel(this);
	int clickCount = 0;

	public MultiListeners1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 100);
		add(panel);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panel.getButton1()) {
			// user has pressed the left button, increment counter
			clickCount++;
			panel.getButton1().setText(Integer.toString(clickCount));
		} else if (e.getSource() == panel.getTextField1()) {
			if (panel.getTextField1().getText().equals("red"))
				panel.setBackground(Color.red);
			else {
				if (panel.getTextField1().getText().equals("blue"))
					panel.setBackground(Color.blue);
				else {
					if (panel.getTextField1().getText().equals("green"))
						panel.setBackground(Color.green);
					else
						panel.setBackground(Color.white);
				}

			}
		}
	}

	public static void main(String[] args) {
		MultiListeners1 gui = new MultiListeners1();
		gui.setVisible(true);
	}
}