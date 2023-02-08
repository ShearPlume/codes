package commands;

import java.util.ArrayList;
import java.util.Random;
import akka.actor.ActorRef;
// import structures.basic.o1.battleField;
import structures.basic.Card;
import structures.basic.Player;
import structures.basic.Tile;
import structures.basic.Unit;
import structures.GameState;
import structures.RunningTimeObjectsController;
import utils.BasicObjectBuilders;
import utils.StaticConfFiles;


public class Initialization2 {
    public static void gameInitialize(ActorRef out) 
    {
        RunningTimeObjectsController o1=new RunningTimeObjectsController();
		BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
		Tile t1;
		for(int x = 0 ; x <= 8 ; x++) {
			for(int y = 0 ; y <= 4 ; y++) {
				t1= BasicObjectBuilders.loadTile(x, y);
				BasicCommands.drawTile(out, t1, 0);
				try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		Player humanPlayer=new Player();
		// p1=humanPlayer;
		Unit humanAvatar=BasicObjectBuilders.loadUnit(StaticConfFiles.humanAvatar, 0, Unit.class);
		Tile t=BasicObjectBuilders.loadTile(2,2);
		BasicCommands.drawTile(out, t, 0);
		humanPlayer.getHavingUnit().add(humanAvatar);// add
		// o1.battleField.tiles[1][1].setUnitInHere(unit);
		t.setUnitInHere(humanAvatar);
        // BasicCommands.drawUnit(out, o1.humanAvatar, o1.battleField.tiles[2][1]);	
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}	
		BasicCommands.drawUnit(out, humanAvatar, t);	
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}	
    }

	public static void gameInitialize(ActorRef out,Player p1)
	{
		Player humanPlayer=new Player();
		// p1=humanPlayer;
		Unit humanAvatar=BasicObjectBuilders.loadUnit(StaticConfFiles.humanAvatar, 0, Unit.class);
		Tile t=BasicObjectBuilders.loadTile(2,2);
		BasicCommands.drawTile(out, t, 0);
		p1.getHavingUnit().add(humanAvatar);// add
		// o1.battleField.tiles[1][1].setUnitInHere(unit);
		t.setUnitInHere(humanAvatar);
        // BasicCommands.drawUnit(out, o1.humanAvatar, o1.battleField.tiles[2][1]);	
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}	
		BasicCommands.drawUnit(out, humanAvatar, t);	
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}	
	} 
}
