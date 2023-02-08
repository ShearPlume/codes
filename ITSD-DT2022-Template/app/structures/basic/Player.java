package structures.basic;

import java.util.ArrayList;

/**
 * A basic representation of of the Player. A player
 * has health and mana.
 * 
 * @author Dr. Richard McCreadie
 *
 */
public class Player {

	private int health;
	private int mana;
	private ArrayList<Unit>  havingUnit; // new
	private ArrayList<Card>  deck; // new
	private Card[]  hand; // new
	
	public Player() {
		super();
		this.health = 20;
		this.mana = 0;
		this.havingUnit = new ArrayList<Unit>();
		this.hand = new Card[6];
		this.deck = new ArrayList<Card>();
	}
	public Player(int health, int mana) {
		super();
		this.health = health;
		this.mana = mana;
		this.havingUnit = new ArrayList<Unit>();
		this.hand = new Card[6];
		this.deck = new ArrayList<Card>();
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public ArrayList<Unit> getHavingUnit() {
		return havingUnit;
	}
	public ArrayList<Card> getDeck(){
		return deck;
	}
	public void setDeck(ArrayList<Card> deck){
		this.deck = deck;
	}
	public Card[] getHand(){
		return hand;
	}
	
}
