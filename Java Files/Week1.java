import java.util.Scanner;

public class Week1 {
    public static void main1(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        /*
         * Scanner input = new Scanner(System.in);
         * System.out.println("第一次输入");
         * String s1 = input.next();
         * input.nextLine();
         * System.out.println("第二次输入");
         * String s2 = input.nextLine();
         * System.out.println("第一次输入内容:" + s1 + "\t第二次输入内容:" + s2);
         */
        // System.out.println(fortuneTeller());;
        
        primenum(99);
        // System.out.println(sum1(4));

    }

    private static String getType(Object a) {
        return a.getClass().toString();
    }

    public static double interest(double deposit, double rate, int cap) {
        double myInterest = deposit * rate / 100;
        if (myInterest < cap)
            return myInterest;
        else
            return cap;
    }

    public static String identify(int legs, boolean fins, boolean feathers, boolean flies, boolean moos,
            boolean brays) {
        if (legs == 0) {
            if (fins)
                return "goldfish";
            else
                return "snake";
        } else {
            if (legs == 2) {
                if (feathers) {
                    if (flies)
                        return "duck";
                    else
                        return "ostrich";
                } else
                    return "human";
            } else {
                if (legs == 4) {
                    if (moos)
                        return "cow";
                    else {
                        if (brays)
                            return "donkey";
                        else
                            return "horse";
                    }
                } else
                    return "octopus";
            }
        }
    }

    public static String fortuneTeller(Scanner myScanner) {
        System.out.println("Pick a number!");
        int n = myScanner.nextInt();
        myScanner.nextLine(); // remember why we do this?
        if (n % 2 == 0) {
            System.out.println("Pick one of the colours: red, blue,green, yellow");
            String colour = myScanner.nextLine().trim();
            if (colour.equals("red"))
                return "You will be very rich!";
            if (colour.equals("blue"))
                return "You will have eternalhappiness!";
            if (colour.equals("green"))
                return "Your children will bestrong!";
            if (colour.equals("yellow"))
                return "Your children will bewise!";
            return "You made a mistake!";
        } else {
            System.out.println("Pick one of the colours: pink, purple,black, white");
            String colour = myScanner.nextLine().trim();
            if (colour.equals("pink"))
                return "You will have a big House!";
            if (colour.equals("purple"))
                return "You will live to bevery old!";
            if (colour.equals("black"))
                return "You will never beLonely!";
            if (colour == "white")
                return "You will never be hungry!";
            System.out.println(colour);

            return "You made a mistake!";
        }
    }

    public static String fortuneTeller() {
        Scanner s = new Scanner(System.in);
        return (fortuneTeller(s));

    }

    public static boolean leapyear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static void primenum(int flag) {
        int num = 0;
        boolean prime;
        if (flag <= 2)
            return;
        for (int i = 2; i < flag; i++) {
            prime = true;
            for (int j = 2; j <= (int)(i/2); j++) {
                if (i % j == 0 && i != j) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                num++;
                System.out.println(i);
            }

        }
        System.out.println("num of prime number between 1 and " + flag + " is: " + num);
    }

    public void test() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {

                }

            }
        }
        System.out.println();
    }

    public static void test2() {
        int age = 22;
        String name = "Bill";
        System.out.println(String.format("%09d", age));
    }

    public static int factorial1(int n) {
        // use a do-while loop
        int top = n;
        int prod = 1;
        do {
            prod *= top;
            top--;
        } while (top > 1);
        return prod;
    }

    public static int factorial2(int n) {
        // use a while loop
        int top = n;
        int prod = 1;
        while (top > 1) {
            prod = prod * top;
            top--;
        }
        return prod;
    }

    public static int factorial3(int n) {
        // use a for loop
        int prod = 1;
        for (int top = n; top > 1; top--)
            prod = prod * top;
        return prod;
    }

    public static int sum1(int n) {
        int sum = 0;
        int flag = 0;
        int i = 0;
        while (flag <= n) {
            if (i % 3 == 0) {
                sum += i;
                flag++;
            }
            i++;
        }
        return sum;

    }


}