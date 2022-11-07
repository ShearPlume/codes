import java.util.Scanner;

public class AE2_2727182Y {
    public static void main(String[] args) {
        Board b = new Board(10, 10);//board
        Player host = new Player("host", b);//tow players, host plays first
        Player guest = new Player("guest", b);
        Scanner scan = new Scanner(System.in);
        b.filltheboard();//fill the board with squares
        b.generateShips();//Randomly generate Ships
        while (true) {//loop untill someone won
            System.out.println(b.toString1());
            if (host.Taketurn(scan)||guest.Taketurn(scan)) {//if either one wins, gameover and show result
                System.out.println("GAME OVER!");
                scan.close();
                break;
            }
            System.out.println(b.toString());
        }
        if(host.getpoints()>guest.getpoints())//determine which one wins
        System.out.println(String.format("Congratulations! %s destroyed %d ships and has won the game!", host.getname(),host.getpoints()));
        else if(host.getpoints()<guest.getpoints())
        System.out.println(String.format("Congratulations! %s destroyed %d ships and has won the game!", guest.getname(),guest.getpoints()));
        else
        System.out.println(String.format("You two played to a draw!", null));
        System.out.println(b.toString());

    }

}
