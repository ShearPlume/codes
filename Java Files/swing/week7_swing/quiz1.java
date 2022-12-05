package swing.week7_swing;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class quiz1 extends JFrame {
    private JButton button1, button2, button3, button4, button5, button6;

    // setTitle code omitted
    public quiz1() {
        this.setSize(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        button6 = new JButton("button 6");
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.cyan);        
        this.add(centerPanel);        
    }

    /* * Main method -- creates the SimpleFrame object */
    public static void main(String[] args) {
        quiz1 gui = new quiz1();
        gui.setVisible(true);
    }

}

// some code omitted
