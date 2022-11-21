package swing.week7_swing.week7lab;
import java.awt.BorderLayout;
import javax.swing.*;

public class Ex2 extends JFrame
{  
   public Ex2() {
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
      Ex2 demo = new Ex2();
    demo.setVisible(true);
   }
}

