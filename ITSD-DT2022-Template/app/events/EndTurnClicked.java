package events;

import com.fasterxml.jackson.databind.JsonNode;

import akka.actor.ActorRef;
import commands.UsingEndTurnClickedToTest;
import structures.GameState;
import structures.basic.Player;

/**
 * Indicates that the user has clicked an object on the game canvas, in this case
 * the end-turn button.
 * 
 * { 
 *   messageType = “endTurnClicked”
 * }
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class EndTurnClicked implements EventProcessor{

	@Override
	public void processEvent(ActorRef out, GameState gameState, JsonNode message) {
		UsingEndTurnClickedToTest.test(out);
	}

	@Override
	public void processPlayerEvent(ActorRef out, GameState gameState, JsonNode message, Player humanPlayer) {
		// TODO Auto-generated method stub
		
	}

}
