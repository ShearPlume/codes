package swing.week7_swing;
//as far as we can go without event handling
//like Plotter2 but uses an inner class
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Plotter3 extends JFrame{
	public Plotter3() {
	// Standard JFrame things...
			this.setSize(1000,800);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			/*
			 * Create the main panel. This will have two columns
			 * The left will be used for the plot, the right
			 * for the pointExplorer
			 */
			JPanel mainPanel = new JPanel(new GridLayout(0,2));
			
			
			
			/*
			 * Create the scatter plot component and add it to
			 * mainPanel 
			 */
			JPanel scatter = new JPanel(); //we'll replace this with our own component later
			scatter.add(new JLabel("UNDER CONSTRUCTION")); 
			mainPanel.add(scatter);		
			
			/*
			 * Create the pointExplorer and add it to mainPanel
			 */
			PointExplorer1 pointExplorer = new PointExplorer1(); 
			//we'll replace this with the fully functional component later
			mainPanel.add(pointExplorer);
			
			/*
			 * Add mainPanel to the frame
			 */
			this.add(mainPanel);
			
			/*
			 * Make the frame visible
			 */
			this.setVisible(true);
		}
	


/*
 * Main method -- creates the Plotter object
 */
public static void main(String[] args) {
	new Plotter3();
}

private class PointExplorer1 extends JPanel { //inner class - it's private, nobody else needs to see it
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

		this.add(internalPanel);
	}
}
		
}

