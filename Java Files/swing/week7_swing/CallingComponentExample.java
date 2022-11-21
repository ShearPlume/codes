package swing.week7_swing;
//example where a component is called from within the JFrame object


import javax.swing.JFrame;

public class CallingComponentExample extends JFrame {
	private SimpleComponent myComponent;
	
	public CallingComponentExample() {
		this.setTitle("JFrame calling a component");
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		myComponent = new SimpleComponent();

		this.add(myComponent);

	}

	/*
	 * Main method -- creates the Frame object
	 */
	public static void main(String[] args) {

		CallingComponentExample gui = new CallingComponentExample();
		gui.setVisible(true);
	}
}
