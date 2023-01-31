package ADS;
import java.util.Scanner;

public class GCD2 {
    static int counter = 0;

    static void cacuGCD(int num1, int num2) {
        if (num1 == num2) {
            if (counter == 0) {
                System.out.println("the GCD is: " + num1);
                return;
            } else if (counter > 0) {
                System.out.println("the GCD is: " + (int) (num1 * Math.pow(2, counter)));
                return;
            }

        } else {
            if (num1 % 2 == 0)// num1 is even
            {
                if (num2 % 2 == 0)// both even
                {
                    counter++;
                    cacuGCD(num1 / 2, num2 / 2);
                } else {
                    cacuGCD(num1 / 2, num2);
                }
            } else if (num2 % 2 == 0)// num1 is odd,num2 is even
            {
                cacuGCD(num1, num2 / 2);
            } else {
                if (num1 > num2) {
                    cacuGCD(num1 - num2, num2);
                } else {
                    cacuGCD(num1, num2 - num1);
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        int n2 = s1.nextInt();
        cacuGCD(n1, n2);
        s1.close();
    }// when u need use cash to pay, need to figure out whats whe best combination of
     // your banknotes and coins since they have different denominations.

}
