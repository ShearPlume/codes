using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class HUAWEI3
    {
        static void QandV(String s)
        {
            String answer = "";
            // String s = Console.ReadLine();
            int N = int.Parse(s.Substring(0, 1));
            int M = int.Parse(s.Substring(2, 1));
            if (N == 0 || M == 0)
            {

            }
            else
            {
                String[] commands = new string[M];
                int[] grades = new int[N];
                s = Console.ReadLine();
                for (int i = 0; i < N; i++)
                {
                    grades[i] = int.Parse(s.Substring(i * 2, 1));
                    // Console.WriteLine(grades[i]);
                }
                for (int i = 0; i < M; i++)
                {
                    commands[i] = Console.ReadLine();
                    // Console.WriteLine(grades[i]);
                    if (commands[i][0] == "Q".ToCharArray()[0])
                    {
                        int head = int.Parse(commands[i].Substring(2, 1));
                        int tail = int.Parse(commands[i].Substring(4, 1));
                        if (head >= tail)
                        {
                            int temp = head;
                            head = tail;
                            tail = temp;
                        }
                        // answer += Convert.ToString(max(grades, head - 1, tail));
                        // if (i != M - 1)
                        //     answer += "\n";
                        Console.WriteLine(max(grades, head - 1, tail));

                    }
                    else
                    {
                        int id = int.Parse(commands[i].Substring(2, 1));
                        int change = int.Parse(commands[i].Substring(4, 1));
                        grades[id - 1] = change;
                    }
                }
            }

            // Console.WriteLine(answer);
            s = "";
            s = Console.ReadLine();
            if (s != "")
                QandV(s);
            else
                return;
        }

        static int max(int[] g, int a, int b)
        {
            int max = 0;
            for (int i = a; i < b; i++)
            {
                if (g[i] >= max)
                    max = g[i];
            }
            return max;
        }

        static void test()
        {
            String input = Console.ReadLine();            
            String[] subinputs = input.Split(" ");
            foreach (var subinput in subinputs)
            {
                String[] finalsubs=subinput.Split("\\");
                String tail=finalsubs[finalsubs.Count()];
                String[] nameandline=tail.Split(" ");
            }
                Console.WriteLine(" ");
        }
        static void Main1()
        {
            test();
            Console.ReadLine();
            // Console.ReadLine();
        }
    }
}
