import java.util.Scanner;

public class Player {
    private String name;
    private Board playboard;
    private int points;// count how many ships have been destroyed by payer

    public Player(String n, Board b) {
        this.name = n;
        this.playboard = b;
        points = 0;
    }

    public String getname()
    {
        return this.name;
    }

    public int getpoints()
    {
        return this.points;
    }

    public boolean ordertoplay() {
        return false;
    }

    public boolean Taketurn(Scanner scan) {        
        System.out.println(
                String.format("It's %s's turn to play, guess a square by entering a row and acolumn:", this.name));
        int row1 = scan.nextInt();
        int column1 = scan.nextInt();
        // scan.close();
        Square selectedsquare = playboard.getsquare(row1 - 1, column1 - 1);       
        if (selectedsquare.getIsship())// there is a ship on the square
        {
            Battleship temp = playboard.getsquare(row1 - 1, column1 - 1).getship();
            if (!selectedsquare.getisattacked())// if square has alraedy been attacked, player loses onre turn, else ship's hp--
            {
                selectedsquare.setisattacked(true);// set the square to isattacked condition
                temp.setHP(temp.getHP() - 1);
                System.out.println(String.format("%s just hit a ship", this.name));
                if (temp.getHP() == 0) {
                    // selectedsquare.setIsship(false);
                    temp.setsunk(true);// hp =0, sunk
                    points++;
                    playboard.numofdestroyedships++;
                    System.out.println(String.format("%s just destroyed a level %d ship, points++ ", this.name,temp.getsize()));
                }
            }
            else
            System.out.println(String.format("%s just hit the same ship square twice,  lost one turn ", this.name));
        }
        else{
            if(selectedsquare.getisattacked())
            System.out.println(String.format("%s just hit a exposed square,  lost one turn, obserbe before you make a guess ", this.name));
            else
            {
                System.out.println(String.format("%s missed", this.name));
                selectedsquare.setisattacked(true);
            }
        }
        System.out.println(name+"'s board: \n"+playboard.toString());//show the board
        if (playboard.numofdestroyedships == LargeBattleShip.maxnum + MediumBattleShip.maxnum + SmallBattleShip.maxnum)// destroyed all the enemy ships                                                                                                      // enemy ships
            return true;
        else
            return false;
        
    }
}
