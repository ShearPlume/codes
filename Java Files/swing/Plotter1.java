package swing;
import javax.swing.JFrame;

public class Plotter1 extends JFrame{
    public Plotter1()
    {
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Plotter1();
    }
    
}
