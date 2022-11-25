package Interface;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class NoAction extends JFrame{
    JTextField text;
    JButton press;
    public NoAction() {
    this.setSize(200,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new FlowLayout());
    text = new JTextField("Not pressed yet");
    panel.add(text);
    press = new JButton("Press me");
    panel.add(press);
    this.add(panel);
    this.setVisible(true);
    }
    public static void main(String[] args) { new NoAction();}
    }
    