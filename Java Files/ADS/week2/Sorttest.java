package ADS.week2;

import java.lang.ProcessBuilder.Redirect.Type;

public class Sorttest {


    public static boolean Issorted(Object[] a) {
        tset a2=new tset(0);
        if (Comparable.class.isAssignableFrom(a[0].getClass()))// if implements the interface
        {
            
            for (int i = 0; i < a.length-1; i++) {
                if (((Comparable) a[i]).compareTo((Comparable)a[i + 1]) >0)// bigger, not ascending
                {
                    return false;

                }

            }
            return true;
        } else
            return false;

    }
    public static void main(String[] args) {
        String []a={"mkl","efg"};
        System.out.println(Issorted(a));
    }

}
