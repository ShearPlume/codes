package swing.week7_swing;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//as far as we can go without event handling


public class Plotter2 extends JFrame{
	public Plotter2() {
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
			
			
			
			 
			
		}
	


/*
 * Main method -- creates the Plotter object
 */
public static void main(String[] args) {
	Plotter2 gui = new Plotter2();
	gui.setVisible(true);
}
		
}

