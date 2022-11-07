import java.util.InputMismatchException;
import java.util.Scanner;

public class IOs {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("enter a integer");
        int try2=0;
        // String try1=s1.nextLine();
        boolean correct=false;
        while(!correct)
        {
            String try1=s1.nextLine();
            Scanner s3 = new Scanner(try1);
            try{
                try2=s3.nextInt();
            }catch(InputMismatchException e)
            {
                e.printStackTrace();
                continue;
            }
            correct=true;
        }
 
                
        System.out.println("enter a integer");
    }

    void test(int a) throws Myexception
    {
        if(a>0)
        throw new Myexception();
    }

    
}
