using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    public class HUAWEI2
    {
        public static int deletenum(int num)
        {
            int index = 0;
            int two = 0;
            int count = 0;
            int i = 0;
            int[] test = new int[num];
            while (true)
            {
                while (two != 2)
                {
                    if (count == num)
                    {
                        return index;
                    }
                    if (test[i] == 0)
                    {
                        two++;
                    }
                    i++;
                    i %= num;
                }
                if (two == 2)
                {
                    if (test[i] == 0)
                    {
                        test[i] = 1;
                        two = 0;
                        count++;
                        index = i;
                    }
                    else
                    {
                        i++;
                        i %= num;
                    }
                }
                if (count == num)
                {
                    //Console.WriteLine(index);
                    return index;
                }

            }

        }

        public static String sortstr(String str)
        {
            ArrayList a=new ArrayList();
            bool repeat = false;
            byte[] array = new byte[1];
            array = System.Text.Encoding.ASCII.GetBytes(str);//ASIIC码
            for(int i=0;i<str.Length;i++)
            {

                for(int j=0;j<i;j++)
                {
                    if (array[j] == array[i])
                    {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat)
                {
                    a.Add(str[i]);
                }
                else
                    repeat = false;
            }
            string str1="";
            for(int i=0;i<a.Count;i++)
            {
                str1 += a[i];
            }
            return str1;
        }

        // public static int Sudoku()
        // {

        // }
        static void Main1()
        {
            Console.WriteLine("test");
            /* while (true)
             {
                 try
                 {
                     Console.WriteLine(deletenum(int.Parse(Console.ReadLine())));
                 }
                 catch(Exception)
                 {
                     return;
                 }
             }*/
            //while (true)
            //{
            //    try
            //    {
            //        Console.WriteLine(sortstr(Console.ReadLine()));
            //    }
            //    catch (Exception)
            //    {
            //        return;
            //    }
            //}


        }
    }
}
