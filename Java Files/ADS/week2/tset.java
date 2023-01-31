package ADS.week2;

public class tset implements Comparable<tset>{
    int a=0;
    public tset(int a1)
    {
        a=a1;
    }
    @Override
    public int compareTo(tset t) {

        if(this.a>t.a)
        return 1;
        else
        // TODO Auto-generated method stub
        return 0;
    }
    public static void main(String[] args) {
        tset t1=new tset(100);
        tset t2=new tset(101);
        System.out.println(t2.compareTo(t1));
    }

}
