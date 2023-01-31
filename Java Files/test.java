import java.util.*;

class ListingWords {
    static public int f1(int n,int x)
    {
        while((x-Math.pow(2, n))>0)
        {
            n++;
        }
        return --n;
    }
    public static void main(String[] args) {
       String int1="50";
       String double1="0.002";
       String test1="   ddd  dd   dd   dd  ";
       System.out.println(test1.trim());
       System.out.println(Integer.parseInt(int1)+""+Double.parseDouble(double1));

    }

    }
}