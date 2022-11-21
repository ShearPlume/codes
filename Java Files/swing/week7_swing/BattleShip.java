package swing.week7_swing;

import java.awt.*;
import javax.swing.JFrame;
public class BattleShip extends JFrame{
    public BattleShip()
    {
        final int UNIT = 20;
        this.setLocation(20,20);
        this.setTitle("BattleShips");
        this.setSize(30*UNIT,30*UNIT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3,3));
        this.add(new FilledPanel(UNIT*6,UNIT*3,UNIT,UNIT*3,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT*2,UNIT*4,UNIT,UNIT*5,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT*2,UNIT*3,UNIT*2,UNIT,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT,UNIT,UNIT*7,UNIT*8,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT,UNIT,UNIT,UNIT,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT,UNIT*6,UNIT*6,UNIT*2,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT*4,UNIT*2,UNIT*4,UNIT,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT*7,UNIT*7,UNIT,UNIT,
        Color.gray,Color.darkGray));
        this.add(new FilledPanel(UNIT,UNIT*2,UNIT*4,UNIT*2,
        Color.gray,Color.darkGray));



        
    }
    public static void main(String[] args){
        BattleShip ships = new BattleShip();
        ships.setVisible(true);
        }

    
}
