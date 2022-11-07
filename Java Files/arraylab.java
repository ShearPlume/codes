import java.util.Random;
import java.util.Scanner;

public class arraylab {

    static double[] createtandomarray() {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            double d = r.nextDouble();
            array[i] = d;
        }
        return array;

    }

    static double returnmean(double[] d) {
        double sum = 0.0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum / d.length;
    }

    static int findfirstint(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }

    static int findlastint(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - i - 1] == target)
                return i;
        }
        return -1;
    }

    static int[] findall(int[] array, int target) {
        int[] index = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target)
                index[++j] = i;
        }
        return index;
    }

    static void CreateMDarrays(int n) {
        int[][] doublearray = new int[n][n];
        String s;
        for (int i = 0; i < n; i++) {
            s="";
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    doublearray[i][j] = j - i + 1;
                else
                    doublearray[i][j] = 0;
                    s+=doublearray[i][j];
                    s+=" ";
            }
            System.out.println(s);

        }


    }

    static void crossgame(int length)
    {
        boolean order=true;
        String s1;
        char[][] board=new char[length][length];
        Scanner s=new Scanner(System.in);
        for(int j=0;j<length;j++)
            {
                for(int k=0;k<length;k++ )
                {
                    board[j][k]='_';
                }
            }
        for(int i=0;i<length*length;i++)
        {

            
            int row1=s.nextInt();
            int column1=s.nextInt();
            // System.out.println(board[row1-1][column1-1]);
            // String test=String.valueOf(board[row1-1][column1-1]);
            if(board[row1-1][column1-1]=='_'&&row1<=length&&column1<=length)
            {
                if(order==true)
                board[row1-1][column1-1]='x';
                else
                board[row1-1][column1-1]='o';
                for(int j=0;j<length;j++)
                {
                    s1="";
                    for(int k=0;k<length;k++)
                    {
                        
                        s1+=board[j][k];
                        s1+=" ";
                    }
                    order=!order;
                    System.out.println(s1);
                }
            }
           
            else
            {
                System.out.println("error occured, pick another place and try again");
                i-=1;
                continue;
            }

        }

    }

    public static void main(String[] args) {
        CreateMDarrays(6);
        // crossgame(3);

    }

}
