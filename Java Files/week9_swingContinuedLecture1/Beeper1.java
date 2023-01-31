package week9_swingContinuedLecture1;


import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Beeper1 extends JFrame implements ActionListener {

	JButton button1, button2;
	int clickCount = 10;

	public Beeper1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 200);
		button1 = new JButton("Please stay");
		this.add(button1, BorderLayout.WEST);
		button1.addActionListener(this);

		button2 = new JButton("Please go");
		this.add(button2, BorderLayout.EAST);
		button2.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			// user has pressed the left button, increment counter
			clickCount++;
			button2.setText(Integer.toString(clickCount));
		} 
		else if (e.getSource() == button2) {
			// user has pressed the right button... so count down 
			// and beep
			clickCount--;
			Toolkit.getDefaultToolkit().beep();
			
			//Toolkit.beep(); - cannot make a static reference to the static method beep

			if (clickCount > 0) {
				button2.setText(Integer.toString(clickCount));

			} else {
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		Beeper1 gui = new Beeper1();
		gui.setVisible(true);
	}
}