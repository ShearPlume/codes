package events;


import com.fasterxml.jackson.databind.JsonNode;

import akka.actor.ActorRef;
import commands.TileClickedToDo;
import structures.GameState;
import structures.basic.Player;

/**
 * Indicates that the user has clicked an object on the game canvas, in this case a tile.
 * The event returns the x (horizontal) and y (vertical) indices of the tile that was
 * clicked. Tile indices start at 1.
 * 
 * { 
 *   messageType = “tileClicked”
 *   tilex = <x index of the tile>
 *   tiley = <y index of the tile>
 * }
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class TileClicked implements EventProcessor{

	@Override
	public void processEvent(ActorRef out, GameState gameState, JsonNode message) {

		int tilex = message.get("tilex").asInt();
		int tiley = message.get("tiley").asInt();

		TileClickedToDo.clickedResponce(out,tilex,tiley,gameState);
		
//		if (gameState.something == true) {
//			// do some logic
//		}
		
	}

	@Override
	public void processPlayerEvent(ActorRef out, GameState gameState, JsonNode message, Player humanPlayer) {
		// TODO Auto-generated method stub
		
	}

}
