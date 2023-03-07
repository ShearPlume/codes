import java.util.*;

class test implements Runnable{

    public void run()
    {
        System.out.println("hello world");

    }
    
    public static void main(String[] args) {
        test t=new test();
        Thread th = new Thread(t);
        th.start();
        System.out.println(th.getPriority());
        ArrayList al;
        // 所有出现的“ a”都替换为“ z”

    }
    
}