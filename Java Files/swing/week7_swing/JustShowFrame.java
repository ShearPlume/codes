package swing.week7_swing;

import javax.swing.*;

public class JustShowFrame extends JFrame
{  
   public JustShowFrame() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,800);
      setLocation(100,100);
      setTitle("XXXXXXXXXXXXXXXXXXXXXXXXX");
   }

   
   public static void main(String [] args)
   {
      JustShowFrame frame = new JustShowFrame();
      //frame.setVisible(true);
   }
}

