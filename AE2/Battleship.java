public class Battleship {
    private boolean isSunk;//
    private int Size;// 0,1,2 means small, middle and big respectively
    private int HP;// health
    private boolean direction;

    Battleship(int size) {
        this.Size = size;
        this.HP = size;
        this.isSunk = false;

    }

    public int getsize()
    {
        return this.Size;
    }

    public int getHP()
    {
        return this.HP;
    }

    public void setHP(int hp)
    {
        this.HP=hp;
    }

    public void setsunk(boolean issunk)
    {
        this.isSunk=issunk;
    }

    public void setdirection(boolean d) {
        this.direction = d;
    }

    public boolean getdirection() {
        return this.direction;
    }

}
