package swing.week7_swing.week7lab;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class Ex5 extends JFrame
{  
   public Ex5() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400,400);
      setLayout(new BorderLayout());
      setTitle("Border layout for JFrame");
      setLocation(100,100);
      Border blackline = BorderFactory.createLineBorder(Color.black);
      JPanel topPanel=new JPanel();
      JPanel rightPanel=new JPanel();
      JPanel bottomPanel=new JPanel();
      JPanel leftPanel=new JPanel();
      JPanel CenterPanel=new JPanel();

      JLabel topLabel=new JLabel("North");
      JLabel bottomlabel=new JLabel("Sorth");
      JLabel rightlabel=new JLabel("East");
      JLabel leftlabel=new JLabel("West");
      JLabel centerlabel=new JLabel("Center");
      Font f = new Font("Sitka Subheading", Font.PLAIN, 24); // this is new
      

      rightPanel.setBorder(blackline);
      leftPanel.setBorder(blackline);
      topPanel.setBorder(blackline);
      bottomPanel.setBorder(blackline);    

      rightPanel.setLayout(new GridBagLayout());
      leftPanel.setLayout(new GridBagLayout());
      CenterPanel.setLayout(new GridBagLayout());

      topPanel.add(topLabel);
      bottomPanel.add(bottomlabel);
      rightPanel.add(rightlabel);
      leftPanel.add(leftlabel);
      CenterPanel.add(centerlabel);

      topLabel.setFont(f);
      bottomlabel.setFont(f);
      rightlabel.setFont(f);
      leftlabel.setFont(f);
      centerlabel.setFont(f);
      this.add(topPanel,BorderLayout.NORTH);
      this.add(bottomPanel,BorderLayout.SOUTH);
      this.add(rightPanel,BorderLayout.EAST);
      this.add(leftPanel,BorderLayout.WEST);
      this.add(CenterPanel,BorderLayout.CENTER);
   }

   
   public static void main(String [] args)
   {
    Ex5 demo = new Ex5();
    demo.setVisible(true);
   }
}

