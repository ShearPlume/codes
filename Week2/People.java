
public class People {
    private String name;
    private int age;
    private String nationality;
    public String getname()
    {
        return this.name;
    }
    public void setname(String n)
    {
        this.name=n;
    }
    public int getage()
    {
        return this.age;
    }
    public void setage(int a)
    {
        this.age=a;
    }
    public String getnation()
    {
        return this.nationality;
    }
    public void setnation(String n)
    {
        this.nationality=n;
    }
    
    public String toString()
    {
        return("name: "+name+" age: "+age+" nationnality: "+nationality);
    }
    public People(String nation)
    {
        this.nationality=nation;

    }
}
