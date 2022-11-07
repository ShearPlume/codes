using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class HUAWEI1
    {
        public static int drinkcount = 0;
        static public int BottleforDrink(int bottles)
        {
            //n表示初始瓶子，x表示借老板的瓶子，则n/2>=x>=n/2-3.且n>6,先讨论n<=6的情况，其他情况递归

                // BottleforDrink()
                return ((bottles+bottles/2)/3);


        }

        static void Quick(int[] Key, int left, int right)
        {
            int current = Key[left];
            int i = left;
            int j = right;

            if (left < right)
            {
                while (i < j) // 当i=j时，表示i之前的数均比current小，之后的数均比current大，即i是current在正确排序序列中的正确位置
                {
                    while (Key[j] >= current && i < j)
                    {
                        j--;
                    }
                    while (Key[i] <= current && i < j)
                    {
                        i++;
                    }
                    if (i < j)
                    {
                        int temp = Key[i];
                        Key[i] = Key[j];
                        Key[j] = temp;
                    }

                }
                Key[left] = Key[i];
                Key[i] = current; // 将current放置到正确的位置上
                if (left < j - 1)
                    Quick(Key, left, j - 1);
                if (j + 1 < right)
                    Quick(Key, j + 1, right);
            }

        }

        static int[] QuickSort(int[] Key)
        {
            Quick(Key, 0, Key.Length - 1);
            return Key;
        }

        static public void test(int N)
        {
            int n = N;
            bool repeat = false;
            int[] num = new int[n];
            for(int i=0;i< n; i++)
            {
                int temp = int.Parse(Console.ReadLine());
                for(int j=0;j<=i;j++)
                {
                    if (temp == num[j])
                    {
                        i--;//没赋值就不算
                        n--;//N也得减，不然会多出外循环
                        repeat = true;
                        break;
                    }
                }
                if (!repeat)
                    num[i] = temp;
                else
                {
                    repeat = false;
                    continue;
                }
                //Console.WriteLine("len: "+num.Length);
                //至此完成去重工作
            }
            num = QuickSort(num);
            for (int j = num.Length-n; j < num.Length; j++)
            {
                Console.WriteLine(num[j]);
                
            }
            //Console.WriteLine("N: " + n);
        }
        static public int trans(String X)
        {
            int total = 0;
            int num = 0;
            int weight=0;
            string temp = X.Substring(2);
            byte[] array = new byte[1];
            array = System.Text.Encoding.ASCII.GetBytes(temp);//ASIIC码
            for (int i=0;i< temp.Length;i++)
            {
                if (array[i] >= 48 && array[i] <= 57)
                    num = array[i] - 48;//0to9
                else
                {
                    num= array[i] - 55;//字母
                }
                weight = (temp.Length - i-1);
                total +=(int)( Math.Pow(16, weight) * num);
            }
            return total;
        }

        static void Main1()
        {
            Console.WriteLine("test");
            int bottles = int.Parse(Console.ReadLine());
            while (bottles != 0)
            {
                Console.WriteLine(BottleforDrink(bottles));
                bottles = int.Parse(Console.ReadLine());
            }

            //int N = int.Parse(Console.ReadLine());
            //test(N);


            //Console.WriteLine(trans(Console.ReadLine()));
        }

    }

}
