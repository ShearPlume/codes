package week9_swingContinuedLecture1;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This frame demonstrates how to install an action listener.
 */
public class ButtonFrame1 extends JFrame implements ActionListener {
	
	private JButton b = new JButton("click me");

	public ButtonFrame1() {
		// JFrame title and size
		this.setTitle("Button with listener");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		b.addActionListener(this);
		this.add(b);

	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource().getClass()==b.getClass())
		this.setVisible(true);
		// (JButton)(e.getSource()).setText("I was clicked.");;
		b.setText("I was clicked.");
		JOptionPane.showConfirmDialog(null, "fku");
		// JOptionPane.showMessageDialog(null, "fku", "fku",  JOptionPane.INFORMATION_MESSAGE );
	}	

	/*
	 * Main method -- creates the ButtonFrame1 object
	 */
	public static void main(String[] args) {
		ButtonFrame1 gui = new ButtonFrame1(); 	
		gui.setVisible(true);	
		// gui.setVisible(true);
	}


}
