package commands;

import java.util.ArrayList;
import java.util.Random;
import akka.actor.ActorRef;
import structures.basic.BattleField;
import structures.basic.Card;
import structures.basic.Player;
import structures.basic.Unit;
import structures.GameState;
import structures.RunningTimeObjectsController;
import utils.BasicObjectBuilders;
import utils.StaticConfFiles;

public class UsingEndTurnClickedToTest {
    public static void test(ActorRef out)
    {
        BasicCommands.addPlayer1Notification(out, "Clicked endturn", 4);
        // BasicCommands.addPlayer1Notification(out, "I got these two ints:"+tx+" and "+ty, 4);
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
    }
    
}
