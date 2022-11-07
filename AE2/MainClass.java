import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Board a=new Board(10, 10);
        Board b = new Board(10, 10);//board
        Player host = new Player("host", a);//tow players, host plays first
        Player guest = new Player("guest", b);
        Scanner scan = new Scanner(System.in);
        a.filltheboard();//fill the board with squares
        a.generateShips();//Randomly generate Ships
        b.filltheboard();//fill the board with squares
        b.generateShips();//Randomly generate Ships
        // System.out.println("board A:\n"+a.toString1());
        // System.out.println("board B:\n"+b.toString1());//these two "toString1" methods is to cheat when testing the game, they show the whole ships' status
        while (true) {//loop untill someone won
            if (host.Taketurn(scan)||guest.Taketurn(scan)) {//if either one wins, gameover and show result
                
                System.out.println("GAME OVER!");
                scan.close();
                break;
            }
            // System.out.println("board A:\n"+a.toString());
            // System.out.println("board B:\n"+b.toString());
        }
        if(host.getpoints()>guest.getpoints())//determine which one wins
        System.out.println(String.format("Congratulations! %s destroyed %d ships and has won the game!", host.getname(),host.getpoints()));
        else if(host.getpoints()<guest.getpoints())
        System.out.println(String.format("Congratulations! %s destroyed %d ships and has won the game!", guest.getname(),guest.getpoints()));
        else
        System.out.println(String.format("You two played to a draw!", null));
        // System.out.println(a.toString());
        // System.out.println(b.toString());

    }

}
