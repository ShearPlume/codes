using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;

namespace HUAWEI
{
    public class test
    {
        public static int drinkcount =0;
        
        public static int BottleForDrink(int bottles)
        {
            return ((bottles+bottles/2)/3);
        }
        static void Main()
        {
            int bottles=int.Parse(Console.ReadLine());
        while(bottles!=0)
        {
            Console.WriteLine(BottleForDrink(bottles));
            bottles=int.Parse(Console.ReadLine());
        }
        }
    }
    
}