package commands;

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

public class Initialization {
	public static void gameInitialize(ActorRef out,GameState gs) {
		// Ye Zhang: 
		// Create battle field, draw tiles and generate every tile objects.
		// Out board X index is from 0~8, and Y index is from 0~4:
		// 		0	1	2	3	4	5	6	7	8
		//	0	口	口	口	口	口	口	口	口	口
		//	1	口	口	口	口	口	口	口	口	口
		//	2	口	口	口	口	口	口	口	口	口
		//	3	口	口	口	口	口	口	口	口	口
		//	4	口	口	口	口	口	口	口	口	口
		BasicCommands.addPlayer1Notification(out, "Preparing battle field...", 4);
		for(int x = 0 ; x <= 8 ; x++) {
			for(int y = 0 ; y <= 4 ; y++) {
				gs.battleField.tiles[y][x] = BasicObjectBuilders.loadTile(x, y);
				BasicCommands.drawTile(out, gs.battleField.tiles[y][x], 0);
				try {Thread.sleep(50);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		// Ye Zhang:
		// Generate 2 players, and give them initial HP and mana.
		// player1 = human (left), player2 = AI (right)
		// Human player initialization
		BasicCommands.addPlayer1Notification(out, "generating human player...", 2);// human player object
		gs.humanPlayer=new Player(20, 0);
		BasicCommands.setPlayer1Health(out, gs.humanPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

		BasicCommands.addPlayer1Notification(out, "generating human player's deck...", 2);// human player's deck
		generateHumanPlayerDeck(gs.humanPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating human avatar...", 3);// human player's avatar
		gs.humanAvatar = BasicObjectBuilders.loadUnit(StaticConfFiles.humanAvatar, 0, Unit.class);
		gs.humanPlayer.getHavingUnit().add(gs.humanAvatar);// add
		gs.humanAvatar.setPositionByTile(gs.battleField.tiles[2][1], gs.battleField, gs.humanAvatar); 
		BasicCommands.drawUnit(out, gs.humanAvatar, gs.battleField.tiles[2][1]);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		BasicCommands.setUnitAttack(out, gs.humanAvatar, 2);
		BasicCommands.setUnitHealth(out, gs.humanAvatar, gs.humanPlayer.getHealth());
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating human initial cards...", 3);// human player's first 3 cards
		initialHumanPlayerCards(out, gs.humanPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		// AI player initialization
		BasicCommands.addPlayer1Notification(out, "generating AI player...", 2);
		gs.aiPlayer = new Player(20, 0);
		BasicCommands.setPlayer2Health(out, gs.aiPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating AI player's deck...", 2);
		generateAIPlayerDeck(gs.aiPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating AI avatar...", 3);// AI player's avatar
		gs.aiAvatar = BasicObjectBuilders.loadUnit(StaticConfFiles.aiAvatar, 1, Unit.class);
		gs.aiPlayer.getHavingUnit().add(gs.aiAvatar);
		gs.aiAvatar.setPositionByTile(gs.battleField.tiles[2][7], gs.battleField, gs.aiAvatar); 
		BasicCommands.drawUnit(out, gs.aiAvatar, gs.battleField.tiles[2][7]);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		BasicCommands.setUnitAttack(out, gs.aiAvatar, 2);
		BasicCommands.setUnitHealth(out, gs.aiAvatar, gs.aiPlayer.getHealth());
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "generating ai initial cards...", 3);// AI player's first 3 cards
		initialAIPlayerCards(out, gs.aiPlayer);
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
		BasicCommands.addPlayer1Notification(out, "Game start", 2);
		
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
	public static void generateAIPlayerDeck(Player player) {
		ArrayList<Card> deck = new ArrayList<Card>();
		
		Card planar_scout_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_planar_scout, 11, Card.class);deck.add(planar_scout_1);
		Card planar_scout_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_planar_scout, 11, Card.class);deck.add(planar_scout_2);
		
		Card rock_pulveriser_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_rock_pulveriser, 12, Card.class);deck.add(rock_pulveriser_1);
		Card rock_pulveriser_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_rock_pulveriser, 12, Card.class);deck.add(rock_pulveriser_2);
		
		Card pyromancer_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_pyromancer, 13, Card.class);deck.add(pyromancer_1);
		Card pyromancer_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_pyromancer, 13, Card.class);deck.add(pyromancer_2);
		
		Card bloodshard_golem_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_bloodshard_golem, 14, Card.class);deck.add(bloodshard_golem_1);
		Card bloodshard_golem_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_bloodshard_golem, 14, Card.class);deck.add(bloodshard_golem_2);
		
		Card blaze_hound_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_blaze_hound, 15, Card.class);deck.add(blaze_hound_1);
		Card blaze_hound_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_blaze_hound, 15, Card.class);deck.add(blaze_hound_2);
		
		Card windshrike_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_windshrike, 16, Card.class);deck.add(windshrike_1);
		Card windshrike_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_windshrike, 16, Card.class);deck.add(windshrike_2);
		
		Card hailstone_golem_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_hailstone_golem, 17, Card.class);deck.add(hailstone_golem_1);
		Card hailstone_golem_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_hailstone_golem, 17, Card.class);deck.add(hailstone_golem_2);
		
		Card serpenti_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_serpenti, 18, Card.class);deck.add(serpenti_1);
		Card serpenti_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_serpenti, 18, Card.class);deck.add(serpenti_2);
		
		Card staff_of_ykir_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_staff_of_ykir, 19, Card.class);deck.add(staff_of_ykir_1);
		Card staff_of_ykir_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_staff_of_ykir, 19, Card.class);deck.add(staff_of_ykir_2);
		
		Card entropic_decay_1 = BasicObjectBuilders.loadCard(StaticConfFiles.c_entropic_decay, 20, Card.class);deck.add(entropic_decay_1);
		Card entropic_decay_2 = BasicObjectBuilders.loadCard(StaticConfFiles.c_entropic_decay, 20, Card.class);deck.add(entropic_decay_2);
		
		player.setDeck(deck);
	}
	
	public static void initialHumanPlayerCards(ActorRef out, Player player) {
		for(int j = 0; j <= 2; j++) { // this for loop is used to draw 3 cards
			int randNum = new Random().nextInt(player.getDeck().size()); // random place of deck
			for(int i = 0; i <= 5; i++) { // player's hand (array)
				if(player.getHand()[i] == null) {
					player.getHand()[i] = player.getDeck().get(randNum);
					BasicCommands.drawCard(out, player.getDeck().get(randNum), i + 1, 0);
					// the array index is 0~5, but card place in front-end is 1~6, so i + 1 
					// draw cards for human player
					break;
				}
			}
			player.getDeck().remove(randNum); // remove the card from deck
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	public static void initialAIPlayerCards(ActorRef out, Player player) {
		for(int j = 0; j <= 2; j++) { // this for loop is used to draw 3 cards
			int randNum = new Random().nextInt(player.getDeck().size()); // random place of deck
			for(int i = 0; i <= 5; i++) { // player's hand (array)
				if(player.getHand()[i] == null) {
					player.getHand()[i] = player.getDeck().get(randNum);
					// the array index is 0~5, but card place in front-end is 1~6, so i + 1 
					// no need to draw cards for AI player
					break;
				}
			}
			player.getDeck().remove(randNum); // remove the card from deck
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	
}
