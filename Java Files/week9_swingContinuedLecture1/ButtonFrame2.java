package week9_swingContinuedLecture1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JOptionPane;

/**
 * This frame demonstrates how to install an action listener.
 */
public class ButtonFrame2 extends JFrame implements ActionListener {
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 100;
	int num = 0;
	private JButton b = new JButton("click me");

	public ButtonFrame2() {
		this.setTitle("Button with listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		ButtonFrame1 b1=new ButtonFrame1();
		b.addActionListener(this);
		this.add(b);
		
	}

	public void actionPerformed(ActionEvent e) {
		num++;
		b.setText(String.format("I was clicked %d times",num));
		String result = JOptionPane.showInputDialog(null, "message");
		b.setText(result);


	}	

	/*
	 * Main method -- creates the ButtonFrame2 object
	 */
	public static void main(String[] args) {

		ButtonFrame2 gui = new ButtonFrame2();
		gui.setVisible(true);
	}

}
