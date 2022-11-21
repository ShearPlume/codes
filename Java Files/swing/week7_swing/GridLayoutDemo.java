package swing.week7_swing;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class GridLayoutDemo extends JFrame{
	JButton button1, button2, button3, button4, button5;
	
	public GridLayoutDemo(){
		this.setTitle("Grid of buttons");
		this.setSize(600,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0,2));// 2 columns and as many rows as we need
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Long-named Button 4");
		button5 = new JButton("Button 5");
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);		
}
	
	public static void main(String[] args) {
		GridLayoutDemo gui = new GridLayoutDemo();
		gui.setVisible(true);
	}

}
