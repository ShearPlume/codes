package swing;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class BUttonFrame extends JFrame{
    private JButton button1,button2,button3;
    private JTextField textField1;
    private JLabel label1;

    public BUttonFrame()
    {
        button1=new JButton("Hello ");
        button2=new JButton("world!");
        button3=new JButton("again!");
        textField1 = new JTextField("initial Text", 10);
        label1 = new JLabel("Click a button");
        this.setLayout(new BorderLayout());


        this.add(label1);
        this.add(button2,BorderLayout.SOUTH);
        this.add(textField1,BorderLayout.EAST);
        this.add(button1,BorderLayout.WEST);
        this.add(button3,BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        // northPanel.setBackground(Color.white);
        // label1 = new JLabel(" Click the Button");
        // button1 = new JButton("Click");
        // northPanel.add(label1);
        // northPanel.add(button1);
        // this.add(northPanel, 
        // BorderLayout.NORTH);


        
        setSize(500,500);
        setLocation(200,200);
        setTitle("Frame with some buttons");

    }

    public static void main(String[] args) {
        BUttonFrame B1=new BUttonFrame();
        B1.setVisible(true);        
    }
}
