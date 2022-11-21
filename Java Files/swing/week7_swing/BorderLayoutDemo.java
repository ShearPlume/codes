package swing.week7_swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutDemo extends JFrame {
	private JButton button1, button2;

	public BorderLayoutDemo() {
		this.setTitle("Button Frame");
		this.setSize(800, 800);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("Press me");
		button2 = new JButton("Press me too");
		
		this.setLayout(new BorderLayout());
		this.add(button1, BorderLayout.CENTER );
		this.add(button2, BorderLayout.SOUTH);
		

	}

	/*
	 * Main method -- creates the SimpleFrame object
	 */
	public static void main(String[] args) {

		BorderLayoutDemo gui = new BorderLayoutDemo();
		gui.setVisible(true);
	}
}
