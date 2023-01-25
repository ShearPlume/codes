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
        System.out.println(f1(0,12));

    }
}