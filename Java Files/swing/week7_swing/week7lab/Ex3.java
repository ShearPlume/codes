package swing.week7_swing.week7lab;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.*;

public class Ex3 extends JFrame
{  
   public Ex3() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setLayout(new BorderLayout());
      setTitle("Border layout for JFrame");
      setLocation(100,100);
      JPanel topPanel=new JPanel();
      JPanel rightPanel=new JPanel();
      JPanel bottomPanel=new JPanel();
      JPanel leftPanel=new JPanel();
      JPanel CenterPanel=new JPanel();
      rightPanel.setLayout(new GridBagLayout());
      leftPanel.setLayout(new GridBagLayout());
      CenterPanel.setLayout(new GridBagLayout());
      topPanel.add(new JLabel("North"));
      bottomPanel.add(new JLabel("Sorth"));
      rightPanel.add(new JLabel("East"));
      leftPanel.add(new JLabel("West"));
      CenterPanel.add(new JLabel("Center"));
      this.add(topPanel,BorderLayout.NORTH);
      this.add(bottomPanel,BorderLayout.SOUTH);
      this.add(rightPanel,BorderLayout.EAST);
      this.add(leftPanel,BorderLayout.WEST);
      this.add(CenterPanel,BorderLayout.CENTER);
   }

   
   public static void main(String [] args)
   {
    Ex3 demo = new Ex3();
    demo.setVisible(true);
   }
}

