package swing.week7_swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PointExplorer1 extends JPanel {
	/*
	 * Outline component - we'll modify this later
	 */
	private JTextArea pointArea;
	private JTextField newX, newY;
	private JButton addPoint;

	public PointExplorer1() {

		/*
		 * Create an internal panel that has 2 rows
		 */
		JPanel internalPanel = new JPanel(new GridLayout(2, 0));

		/*
		 * Create a text area (20 rows, 20 columns) and add it to the first row
		 * of internalPanel
		 */
		pointArea = new JTextArea(20, 20);
		internalPanel.add(pointArea);

		/*
		 * Create a panel for the fields and button Create and add the
		 * Textfields (width 5) and the button
		 */
		JPanel fieldPanel = new JPanel(new FlowLayout());
		newX = new JTextField(5);
		fieldPanel.add(newX);
		newY = new JTextField(5);
		fieldPanel.add(newY);
		addPoint = new JButton("Add point");
		fieldPanel.add(addPoint);
		

		internalPanel.add(fieldPanel);
		fieldPanel.setBackground(Color.DARK_GRAY);
        this.setBackground(Color.DARK_GRAY); //needed this to get it to show up on screen!
		this.add(internalPanel);
	}
}
