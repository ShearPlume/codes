import java.util.Scanner;

    public class Main
    {
        static int index = 0;
        static int two = 0;
        static int count = 0;

        public static void main1(String[] args) {
            Scanner s=new Scanner(System.in);
            while(s.hasNextInt())
            {
                deletenum(s.nextInt());
            }
                        
        }

        public static void deletenum(int num)
        {
            int index = 0;
            int two = 0;
            int count = 0;
            int i = 0;
            int[]test= new int[num];
            for(int j=0; j<num;j++)
            {
                test[j] = 0;
            }
            while(true)
            {                
                while (two!=2)
                {
                    if (count == num)
                    {
                        System.out.println(index);
                        return;
                    }
                    if (test[i] == 0)
                    {                        
                        two++;
                    }
                    i++;
                    i %= num;
                }

                if (two==2)
                {
                    if (test[i]==0)
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
                if(count==num)
                {
                    System.out.println(index);
                    return;
                }    

            }
            
        }
    }

