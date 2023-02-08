package structures;
import java.util.ArrayList;
import java.util.Random;
import akka.actor.ActorRef;
import structures.basic.BattleField;
import structures.basic.Card;
import structures.basic.Player;
import structures.basic.Unit;
import structures.GameState;
import utils.BasicObjectBuilders;
import utils.StaticConfFiles;


public class RunningTimeObjectsController {
    public String s1="asd";
    public BattleField battleField;
    public Player humanPlayer;
    public Unit humanAvatar;
    public Player aiPlayer;
    public Unit aiAvatar;
    public ArrayList<Card> deck;
    public RunningTimeObjectsController o1;
    public RunningTimeObjectsController()
    {
        battleField = new BattleField();
        humanPlayer = new Player(20, 0);
        humanAvatar = BasicObjectBuilders.loadUnit(StaticConfFiles.humanAvatar, 0, Unit.class);
        aiPlayer = new Player(20, 0);
        aiAvatar = BasicObjectBuilders.loadUnit(StaticConfFiles.aiAvatar, 1, Unit.class);
        deck = new ArrayList<Card>();

    }
    public static void main(String[] args) {
        // RunningTimeObjectsController o1=new RunningTimeObjectsController();
    }
}
