package swing.week7_swing.week7lab;
import java.awt.BorderLayout;
import javax.swing.*;

public class Ex1 extends JFrame
{  
   public Ex1() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setLayout(new BorderLayout());
      setTitle("Border layout for JFrame");
      setLocation(100,100);
      this.add(new JLabel("North"),BorderLayout.NORTH);
      this.add(new JLabel("Sorth"),BorderLayout.SOUTH);
      this.add(new JLabel("East"),BorderLayout.EAST);
      this.add(new JLabel("West"),BorderLayout.WEST);
      this.add(new JLabel("Center"),BorderLayout.CENTER);
   }

   
   public static void main(String [] args)
   {
    Ex1 demo = new Ex1();
    demo.setVisible(true);
   }
}

