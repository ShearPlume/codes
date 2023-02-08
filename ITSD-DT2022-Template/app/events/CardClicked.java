package events;


import com.fasterxml.jackson.databind.JsonNode;

import akka.actor.ActorRef;
import commands.BasicCommands;
import structures.GameState;
import structures.basic.Player;
import commands.Initialization;

/**
 * Indicates that the user has clicked an object on the game canvas, in this case a card.
 * The event returns the position in the player's hand the card resides within.
 * 
 * { 
 *   messageType = “cardClicked”
 *   position = <hand index position [1-6]>
 * }
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class CardClicked implements EventProcessor{

	@Override
	public void processPlayerEvent(ActorRef out, GameState gameState, JsonNode message, Player human) {
		
		int handPosition = message.get("position").asInt();
		
		if(gameState.cardWaiting == false) {
			gameState.cardWaiting = true; // card selected
			BasicCommands.drawCard(out, human.getHand()[handPosition - 1], handPosition, 1);
		}else {
			BasicCommands.drawCard(out, human.getHand()[handPosition - 1], handPosition, 1);
		}
		
		
	}
	
	public void processEvent(ActorRef out, GameState gameState, JsonNode message) {
		
	}

}
