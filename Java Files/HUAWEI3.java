import java.io.Console;
import java.util.Scanner;

public class HUAWEI3 {
    static void QandV(Scanner sc1) {
        String answer = "";
        // Scanner sc1=new Scanner(System.in);
        String s = sc1.nextLine();
        int N = Integer.parseInt(s.substring(0, 1));
        int M = Integer.parseInt(s.substring(2, 3));
        String[] commands = new String[M];
        int[] grades = new int[N];
        s = sc1.nextLine();
        for (int i = 0; i < N; i++) {
            grades[i] = Integer.parseInt(s.substring(2 * i, 2 * i + 1));
            // Console.WriteLine(grades[i]);
        }
        for (int i = 0; i < M; i++) {
            commands[i] = sc1.nextLine();
            // Console.WriteLine(grades[i]);
            if (commands[i].charAt(0) == "Q".toCharArray()[0]) {
                int head = Integer.parseInt(commands[i].substring(2, 3));
                int tail = Integer.parseInt(commands[i].substring(4, 5));
                if (head >= tail) {
                    int temp = head;
                    head = tail;
                    tail = temp;
                }
                answer += max(grades, head - 1, tail);
                if (i != M - 1)
                    answer += "\n";
                // System.out.println(max(grades,head-1,tail));
            } else {
                int id = Integer.parseInt(commands[i].substring(2, 3));
                int change = Integer.parseInt(commands[i].substring(4, 5));
                grades[id - 1] = change;
            }
        }
        // System.out.println(answer);
        if(sc1.hasNextInt())
        {
            System.out.println(answer);
            QandV(sc1);
        }
        else
        {
            System.out.println(answer);
            return;
        }
        return;
        // sc1.nextLine();
    }

    static int max(int[] g, int a, int b) {
        int max = 0;
        for (int i = a; i < b; i++) {
            if (g[i] >= max)
                max = g[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        QandV(sc1);

        // if ()
        // {

        // int a=0;
        // }

        // Console.ReadLine();
    }

}