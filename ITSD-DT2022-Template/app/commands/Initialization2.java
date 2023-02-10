//不要管这个，这是测试类
package commands;

import java.util.ArrayList;
import java.util.Random;
import akka.actor.ActorRef;
import structures.basic.BattleField;
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
    public static void gameInitialize(ActorRef out, GameState gs) 
    {
		// gs=new GameState();




		
        RunningTimeObjectsController o1=new RunningTimeObjectsController();
		BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
		for(int x = 0 ; x <= 8 ; x++) {
			for(int y = 0 ; y <= 4 ; y++) {
				gs.battleField.tiles[y][x] = BasicObjectBuilders.loadTile(x, y);
				BasicCommands.drawTile(out, gs.battleField.tiles[y][x], 0);
				// try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}//gs.battleField.tiles
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

		BasicCommands.addPlayer1Notification(out, "generating human player...", 2);// human player object
		gs.humanPlayer=new Player(20, 0);
		BasicCommands.setPlayer1Health(out, gs.humanPlayer);
		// p1=humanPlayer;

		BasicCommands.addPlayer1Notification(out, "generating human player's deck...", 2);// human player's deck
		generateHumanPlayerDeck(gs.humanPlayer);
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}


		BasicCommands.addPlayer1Notification(out, "generating human avatar...", 3);// human player's avatar
		gs.humanAvatar = BasicObjectBuilders.loadUnit(StaticConfFiles.humanAvatar, 0, Unit.class);
		gs.humanPlayer.getHavingUnit().add(gs.humanAvatar);// add
		gs.humanAvatar.setPositionByTile(gs.battleField.tiles[2][1]); 
		gs.battleField.tiles[2][1].setUnitInHere(gs.humanAvatar);
		BasicCommands.drawUnit(out, gs.humanAvatar, gs.battleField.tiles[2][1]);
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		BasicCommands.setUnitAttack(out, gs.humanAvatar, 2);
		BasicCommands.setUnitHealth(out, gs.humanAvatar, gs.humanPlayer.getHealth());
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating human initial cards...", 3);// human player's first 3 cards

		for(int j = 0; j <= 2; j++) { // this for loop is used to draw 3 cards
			int randNum = new Random().nextInt(gs.humanPlayer.getDeck().size()); // random place of deck
			for(int i = 0; i <= 5; i++) { // player's hand (array)
				if(gs.humanPlayer.getHand()[i] == null) {
					gs.humanPlayer.getHand()[i] = gs.humanPlayer.getDeck().get(randNum);
					BasicCommands.drawCard(out, gs.humanPlayer.getDeck().get(randNum), i + 1, 0);
					// the array index is 0~5, but card place in front-end is 1~6, so i + 1 
					// draw cards for human player
					break;
				}
			}
			gs.humanPlayer.getDeck().remove(randNum); // remove the card from deck
		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	

		// try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		



    }



	public static void generateHumanPlayerDeck(Player player) {
		ArrayList<Card> deck = new ArrayList<Card>();
		
		Card comodo_charger_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_comodo_charger, 1, Card.class);deck.add(comodo_charger_1);
		Card comodo_charger_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_comodo_charger, 1, Card.class);deck.add(comodo_charger_2);
		
		Card hailstone_golem_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_hailstone_golem, 2, Card.class);deck.add(hailstone_golem_1);
		Card hailstone_golem_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_hailstone_golem, 2, Card.class);deck.add(hailstone_golem_2);
		
		Card pureblade_enforcer_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_pureblade_enforcer, 3, Card.class);deck.add(pureblade_enforcer_1);
		Card pureblade_enforcer_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_pureblade_enforcer, 3, Card.class);deck.add(pureblade_enforcer_2);
		
		Card azure_herald_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_azure_herald, 4, Card.class);deck.add(azure_herald_1);
		Card azure_herald_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_azure_herald, 4, Card.class);deck.add(azure_herald_2);
		
		Card silverguard_knight_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_silverguard_knight, 5, Card.class);deck.add(silverguard_knight_1);
		Card silverguard_knight_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_silverguard_knight, 5, Card.class);deck.add(silverguard_knight_2);
		
		Card azurite_lion_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_azurite_lion, 6, Card.class);deck.add(azurite_lion_1);
		Card azurite_lion_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_azurite_lion, 6, Card.class);deck.add(azurite_lion_2);
		
		Card fire_spitter_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_fire_spitter, 7, Card.class);deck.add(fire_spitter_1);
		Card fire_spitter_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_fire_spitter, 7, Card.class);deck.add(fire_spitter_2);
		
		Card ironcliff_guardian_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_ironcliff_guardian, 8, Card.class);deck.add(ironcliff_guardian_1);
		Card ironcliff_guardian_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_ironcliff_guardian, 8, Card.class);deck.add(ironcliff_guardian_2);
		
		Card truestrike_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_truestrike, 9, Card.class);deck.add(truestrike_1);
		Card truestrike_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_truestrike, 9, Card.class);deck.add(truestrike_2);
		
		Card sundrop_elixir_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_sundrop_elixir, 10, Card.class);deck.add(sundrop_elixir_1);
		Card sundrop_elixir_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_sundrop_elixir, 10, Card.class);deck.add(sundrop_elixir_2);
		
		player.setDeck(deck);
	}

}
