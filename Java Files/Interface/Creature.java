package Interface;

public class Creature {
    private String name; 
    public Creature(String n)
    {
        name=n;
    }
    public void selfintro()
    {
        System.out.println(name);
    }
    public String getname()
    {
        return name;
    }
    
}
