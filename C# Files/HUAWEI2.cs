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
            ArrayList a = new ArrayList();
            bool repeat = false;
            byte[] array = new byte[1];
            array = System.Text.Encoding.ASCII.GetBytes(str);//ASIIC码
            for (int i = 0; i < str.Length; i++)
            {

                for (int j = 0; j < i; j++)
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
            string str1 = "";
            for (int i = 0; i < a.Count; i++)
            {
                str1 += a[i];
            }
            return str1;
        }

        public static void Sudoku()
        {
            bool gotone = false;
            int numof0 = 0;
            ArrayList[] lineexcept = new ArrayList[9];//每行缺的数字集合
            ArrayList[] rowexcept = new ArrayList[9];//每列缺的数字集合
            ArrayList[] originlineexcept = new ArrayList[9];
            ArrayList[] originrowexcept = new ArrayList[9];
            ArrayList[] position = new ArrayList[9];//全部缺数字的行列位置
            for (int i = 0; i < 9; i++)
            {
                lineexcept[i] = new ArrayList();
                rowexcept[i] = new ArrayList();
                position[i] = new ArrayList();
                for (int j = 0; j < 9; j++)
                {
                    lineexcept[i].Add(j + 1);
                    rowexcept[i].Add(j + 1);
                }
            }
            int[,] sudoku = new int[9, 9];//存储string
                                          // int[,] position = new int[9, 2];//存储9个0的行列位置
            for (int i = 0; i < 9; i++)
            {
                String temp = Console.ReadLine();
                for (int j = 0; j < 9; j++)
                {
                    // Console.WriteLine(int.Parse(temp[2*j].ToString()));
                    sudoku[i, j] = int.Parse(temp.Substring(2 * j, 1));//把string保存到二维数组里

                    if (sudoku[i, j] == 0)
                    {
                        numof0++;
                        position[i].Add((j));
                    }
                    else
                    {
                        lineexcept[i].Remove(sudoku[i, j]);//把每行已经有的非零元素从1到9中去除，剩下的便是待选项
                        rowexcept[j].Remove(sudoku[i, j]);//把每列已经有的非零元素从1到9中去除，剩下的便是待选项
                    }
                }
                for (int d = 0; d < 9; d++)
                {
                    originlineexcept[d] = new ArrayList();
                    originrowexcept[d] = new ArrayList();
                    for (int j = 0; j < lineexcept[d].Count; j++)
                    {
                        originlineexcept[d].Add(lineexcept[d][j]);
                    }
                    for (int j = 0; j < rowexcept[d].Count; j++)
                    {
                        originrowexcept[d].Add(rowexcept[d][j]);
                    }
                }
            }

            for (int t = 0; t < numof0; t++)
            {
                for (int i = 0; i < 9; i++)//第i行
                {
                    for (int j = 0; j < lineexcept[i].Count; j++)//第i行缺的第j个元素，position[i，j]表示这个元素的列
                    {
                        int row = (int)position[i][j];//position[i，j]表示这个元素的列
                        for (int k = 0; k < lineexcept[i].Count; k++)
                        {
                            for (int h = 0; h < rowexcept[row].Count; h++)
                            {
                                if ((int)lineexcept[i][k] == (int)rowexcept[row][h])
                                {
                                    int temp = (int)lineexcept[i][k];
                                    sudoku[i, row] = temp;
                                    lineexcept[i].Remove(temp);
                                    rowexcept[row].Remove(temp);//找到一个后一定要把其从line和row却的名单里取出不然之后会重复添加到其他行列
                                    position[i].RemoveAt(j);
                                    gotone = true;
                                    numof0--;

                                    // String show1 = "";
                                    // for (int m = 0; m < 9; m++)
                                    // {
                                    //     show1 = "";
                                    //     for (int f = 0; f < 9; f++)
                                    //     {
                                    //         show1 += sudoku[m, f];
                                    //         show1 += " ";
                                    //     }
                                    //     Console.WriteLine(show1);
                                    // }
                                    break;
                                }
                            }
                            if (gotone)
                                break;
                        }
                        if (gotone)
                            break;

                    }
                    if (gotone)
                    {
                        gotone=false;
                        break;
                    }
                    //到这里应该就已经全部补全了
                }
            }

            String show = "";
            Console.WriteLine("/n");
            for (int i = 0; i < 9; i++)
            {
                show = "";
                for (int j = 0; j < 9; j++)
                {
                    show += sudoku[i, j];
                    show += " ";
                }
                Console.WriteLine(show);
                
            }
            Console.ReadLine();
            //return 2;
        }
        static void Main1()
        {
            // while (true)
            //  {
            //      try
            //      {
            //          Console.WriteLine(deletenum(int.Parse(Console.ReadLine())));
            //      }
            //      catch(Exception)
            //      {
            //          return;
            //      }
            //  }
            // while (true)
            // {
            //    try
            //    {
            //        Console.WriteLine(sortstr(Console.ReadLine()));
            //    }
            //    catch (Exception)
            //    {
            //        return;
            //    }
            // }
            Sudoku();
            // int a=0;
            // String s="x1";
            // a = int.Parse(s.Substring(1,1));//把string保存到二维数组里
            // Console.WriteLine(a);
            // Console.ReadLine();
        }
    }
}
