package commands;

import java.util.ArrayList;
import java.util.Random;
import akka.actor.ActorRef;
import structures.basic.BattleField;
import structures.basic.Card;
import structures.basic.Player;
import structures.basic.Tile;
import structures.basic.Unit;
import structures.GameState;
import utils.BasicObjectBuilders;
import utils.StaticConfFiles;

public class TileClickedToDo {
    public static void clickedResponce(ActorRef out,int tx,int ty) 
    {
        BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
        BasicCommands.addPlayer1Notification(out, "I got these two ints:"+tx+" and "+ty, 4);
        Tile t1= BasicObjectBuilders.loadTile(tx, ty);
        BasicCommands.drawTile(out, t1, 2);
        try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
        // try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }
    public static void clickedResponce2(ActorRef out) 
    {
        BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
        System.out.println("asd");
    }
}
