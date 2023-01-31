package ADS.week1;

public class Findroots {
    void func(int a, int b, int c) {
        double condition = Math.pow(b, 2) - 4 * a * c;
        if (condition == 0)
            System.out.println("the only root is: " + (-b) / (2 * a));
        else if (condition > 0) {
            double sqrt = Math.sqrt(condition);
            System.out.println("the two roots are: " + (-b + sqrt) / (2 * a) + "and " + (-b - sqrt) / (2 * a));
        }
    }
}
