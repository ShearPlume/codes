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
    public static void clickedResponce(ActorRef out,int tx,int ty,GameState gs) 
    {
        // BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
        BasicCommands.addPlayer1Notification(out, "I got these two ints:"+tx+" and "+ty, 4);//点击tile后打印tile信息
        BasicCommands.drawTile(out, gs.battleField.tiles[ty][tx], 2);//变红
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
        BasicCommands.drawTile(out, gs.battleField.tiles[ty][tx], 0);//50ms 后变回去
        // try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }
}
