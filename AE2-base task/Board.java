import java.util.Random;

public class Board {
    private int row;
    private int column;
    public int numofdestroyedships;//count how many ships have been sunk, using this to determine if game ends
    private Square[][] status;
    public Board(int r, int c) {
        this.column = c;
        this.row = r;
        status=new Square[row][column];
        numofdestroyedships=0;
    }

    public Square getsquare(int r,int c)//get a specific square
    {
        return this.status[r][c];
    }

    public void filltheboard() {
        for(int i=0;i<row;i++)//fill the board with squares, by refering each square in the array to a real square
        {
            for(int j=0;j<column;j++)
            {
                Square temp=new Square(i, j);
                status[i][j]=temp;
            }
        }
    }

    public void generateShips() {      
        Battleship ships[]=new Battleship[5];//maxnum means ship size and ship hp both
        int shipHeadRow;
        int shipHeadCol;  /*
        These 2 varibales mean the position of the Ship Head
        Depening on the size and the direction of a ship, the two variables have different restraints
        e.g. A vertically placed Largeship's HeadRow can not be 8 or 9 */
        for(int i=0;i<ships.length;i++)
        {            
            Random r = new Random();
            ships[i]=new Battleship(2);
            ships[i].setdirection(r.nextBoolean());//randomly set the direction of the ship
            if(ships[i].getdirection())//direction is true means the ship is vertically placed
            {
                do
                {
                     shipHeadRow=r.nextInt(this.row-2);//generate a random int form 0 to row-2
                     shipHeadCol=r.nextInt(this.column-1);
                }
                while(status[shipHeadRow][shipHeadCol].getIsship()||status[shipHeadRow+1][shipHeadCol].getIsship());
            //codes above aims to avoid ship overlap                
                status[shipHeadRow][shipHeadCol].setIsship(true);
                status[shipHeadRow+1][shipHeadCol].setIsship(true);
                status[shipHeadRow][shipHeadCol].setship(ships[i]);//set ship to the coresponding squre
                status[shipHeadRow+1][shipHeadCol].setship(ships[i]);
            }
            else{//the ship is horizontally placed  
                do
                {
                     shipHeadRow=r.nextInt(this.row-1);
                     shipHeadCol=r.nextInt(this.column-2);//generate a random int form 0 to column-3
                }
                while(status[shipHeadRow][shipHeadCol].getIsship()||status[shipHeadRow][shipHeadCol+1].getIsship());
                status[shipHeadRow][shipHeadCol].setIsship(true);
                status[shipHeadRow][shipHeadCol+1].setIsship(true);
                status[shipHeadRow][shipHeadCol].setship(ships[i]);
                status[shipHeadRow][shipHeadCol+1].setship(ships[i]);
            }
        }
                
        
        //all ships placed

    }

    @Override
    public String toString() {
        String s="";
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                s+=status[i][j].toString();
                if(j==column-1)
                s+="\n";
            }
        }
        return s;
    }
    
    public String toString1() {
        String s="";
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                s+=status[i][j].toString1();
                if(j==column-1)
                s+="\n";
            }
        }
        return s;
    }
}
