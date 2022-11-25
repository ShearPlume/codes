package Interface;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Addaction extends JFrame implements ActionListener {
    JTextField text;
    JButton press;
    public Addaction() {
    this.setSize(200,200);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panel = new JPanel(new FlowLayout());
    text = new JTextField("Not pressed yet");
    panel.add(text);
    press = new JButton("Press me");
    press.addActionListener(this);
    panel.add(press);
    this.add(panel);
    this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        text.setText("Pressed!");
    }
    public static void main(String[] args) { new Addaction();}
    }
    