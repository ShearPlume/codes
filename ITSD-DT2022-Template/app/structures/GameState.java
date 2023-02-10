package structures;

import structures.basic.BattleField;
import structures.basic.Player;
import structures.basic.Tile;
import structures.basic.Unit;

/**
 * This class can be used to hold information about the on-going game.
 * Its created with the GameActor.
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class GameState {
	public Player humanPlayer;

	public Player aiPlayer;
	

	public BattleField battleField;
	
	// public Tile[][] tiles;

	public Unit humanAvatar;

	public Unit aiAvatar;

	public boolean gameInitalised = false;
	
	public boolean unitWaiting = false;
	
	public boolean cardWaiting = false;
	
	public boolean humanPlayerTurn = false;

	public GameState()
	{
		// humanPlayer=new Player();
		humanAvatar=new Unit();
		aiAvatar=new Unit();
		// tiles=new Tile[5][9];
		battleField = new BattleField();
	}

	
}
