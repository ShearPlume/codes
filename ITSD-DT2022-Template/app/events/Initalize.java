package events;

import com.fasterxml.jackson.databind.JsonNode;

import akka.actor.ActorRef;
import commands.Initialization;
import demo.CheckMoveLogic;
import demo.CommandDemo;
import structures.GameState;
import structures.basic.Player;
import structures.basic.RoundCounter;

/**
 * Indicates that both the core game loop in the browser is starting, meaning
 * that it is ready to recieve commands from the back-end.
 * 
 * { 
 *   messageType = “initalize”
 * }
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class Initalize implements EventProcessor{

	@Override
	public void processEvent(ActorRef out, GameState gameState, JsonNode message) {
		
		gameState.gameInitalised = true;	
		RoundCounter roundCounter = new RoundCounter();
		
		Initialization.gameInitialize(out);
		
		gameState.humanPlayerTurn = true;
		
		
	}

	@Override
	public void processPlayerEvent(ActorRef out, GameState gameState, JsonNode message, Player humanPlayer) {
		// TODO Auto-generated method stub
		
	}

}


