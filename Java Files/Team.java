public class Team {
    private String name;
    private int numGold;
    private int numSilver;
    private int numBronze;

    @Override
    public String toString() {
        return String.format("%-15s|%4d|%4d|%4d", name, numGold, numSilver, numBronze);
    }

    public static void main(String[] args) {
        Team t = new Team();
        t.name = "China";
        t.numGold = 10;
        t.numSilver = 9;
        t.numBronze = 8;
        System.out.println(t);
    }

    public Leaderboard(int teamNum) {
        this.numTeams = teamNum;
        for (int i = 0; i < teamNum; i++) {
         this.teams[i] = new Team();
       }
}
