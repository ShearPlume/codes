package swing;
import javax.swing.*;

public class Justshowframe extends JFrame{
    public Justshowframe()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(200,200);
        setTitle("Just a Frame");

    }

    public static void main(String[] args) {
        Justshowframe J1=new Justshowframe();
        J1.setVisible(true);
    }
}
