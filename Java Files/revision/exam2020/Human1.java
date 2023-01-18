package revision.exam2020;

public class Human1 implements Comparable{
    private int age;
    public Human1(int a)
    {
        age=a;
    }

    public int getage()
    {
        return age;
    }
    @Override
    public int compareTo(Object o) {
        Human1 other=(Human1)o;
        // TODO Auto-generated method stub
        if(this.getage()>=other.getage())
        {
            return 1;
        }
        else
        return 0;
    }
    public static void main(String[] args) {
        Human1 h1=new Human1(22);
        Human1 h2=new Human1(26);
        int out=3;
        if(h2.compareTo(h1)==1)
        out=1;
        else
        out=0;
        System.out.println(out);//实现比较
    }

    
}
