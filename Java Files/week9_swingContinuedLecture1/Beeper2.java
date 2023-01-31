package week9_swingContinuedLecture1;


import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Beeper2 extends JFrame implements ActionListener {
	
	// helper method
	private static void beepAndEnd(JButton b1, int counter){
		Toolkit.getDefaultToolkit().beep();
		if (counter > 0) {
			b1.setText(Integer.toString(counter));

		} else {
			System.exit(0);
		}
	}

 	JButton button1, button2;
	int clickCount = 10;

	public Beeper2() {
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
			beepAndEnd(button2,clickCount);
			
		}
	}

	public static void main(String[] args) {
		Beeper2 gui = new Beeper2();
		gui.setVisible(true);
	}
}