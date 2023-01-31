package ADS.week1;
import java.util.Scanner;

public class GCD {
    static void cacuGCD(int num1, int num2) {
        if (num1 % num2 != 0)// if q does not exactly divide p
        {
            cacuGCD(num2, num1 % num2);
        } else
            System.out.println("the GCD is: " + num2);
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();
        cacuGCD(n1, n2);
        s1.close();
    }
}
