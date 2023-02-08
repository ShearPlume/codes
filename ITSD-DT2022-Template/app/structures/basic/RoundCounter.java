package structures.basic;

public class RoundCounter {
	private int roundNum;
	public RoundCounter() {
		this.roundNum = 1;
	}
	public int getRoundNum() {
		return roundNum;
	}
	
	public void nextRound() {
		this.roundNum += 1;
	}
	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	
}
