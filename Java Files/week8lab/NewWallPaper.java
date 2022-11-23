package week8lab;

import java.awt.*;
import javax.swing.JFrame;

public class NewWallPaper extends JFrame{
    public NewWallPaper(){
    // the usual JFrame stuff
    final int UNIT = 20;
    this.setLocation(20,20);
    this.setTitle("Wallpaper1");
    this.setSize(30*UNIT, 30*UNIT);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new GridLayout(3,2));
		
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.red,Color.white, Color.magenta));
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.white,Color.green, Color.orange));
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.green,Color.blue, Color.pink));
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.blue,Color.yellow, Color.yellow));
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.yellow,Color.cyan,Color.blue));
    this.add(new TripleFilledPanel(UNIT/2,UNIT/2,UNIT/2,UNIT/2,UNIT,UNIT,UNIT,UNIT, Color.cyan,Color.red,Color.black));
    
    
    }
    public static void main(String[] args){
        NewWallPaper gui = new NewWallPaper();
    gui.setVisible(true);
    }}

    