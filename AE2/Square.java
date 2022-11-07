public class Square {
    private int row;
    private int column;
    private boolean isAship;
    private boolean isAttacked;
    private Battleship Ship;

    public int getrow()
    {
        return this.row;
    }
    public void setrow(int r)
    {
        this.row=r;
    }
    public int getcolumn()
    {
        return this.column;
    }
    public void setcolumn(int c)
    {
        this.column=c;
    }
    public boolean getIsship()
    {
        return this.isAship;
    }
    public void setIsship(Boolean is)
    {
        this.isAship=is;
    }
    public Battleship getship()
    {
        return this.Ship;
    }
    public void setship(Battleship ship)
    {
        this.Ship=ship;
    }

    public boolean getisattacked()
    {
        return this.isAttacked;
    }
    public void setisattacked(boolean isattacked)
    {
        this.isAttacked=isattacked;
    }

    public Square(int r,int c)
    {
        row=r;
        column=c;
        isAship=false;
        isAttacked=false;

    }
    public Square(int r,int c,Battleship s)//Overloading the constructor with 3 attributes
    {
        row=r;
        column=c;
        Ship=s;
        isAship=false;
        isAttacked=false;

    }
    @Override
    public String toString() {
        String icon="";
        if(isAttacked)
        {
            if(isAship)
            icon=String.format("%s%s%s", " ","x"," ");
            else
            icon=String.format("%s%s%s", " ","o"," ");           
        }//correct code
        // if(isAship)
        // {            
        //     icon=String.format("%s%s%s", " ","*"," ");           
        // }//test code
        else
        icon=String.format("%s%s%s", " ","-"," "); 
        return icon;
    }
    public String toString1() 
    {
        String icon="";
        if(isAship)
        {            
            icon=String.format("%s%s%s", " ","*"," ");           
        }//test code
        else
        icon=String.format("%s%s%s", " ","-"," "); 
        return icon;
    }
    
}
