package swing.week7_swing;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;


public class SimpleComponent extends JPanel {
	/*
	 * Outline component - we'll modify this later
	 */
	private JTextArea textArea;
	private JButton button1;

	public SimpleComponent() {
		this.setLayout(new GridLayout(2,0));

		textArea = new JTextArea(10,20);
		textArea.setText("Some text can go in here!");
		this.add(textArea);
		button1 = new JButton("Click me");
		this.add(button1);
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}
		
}
