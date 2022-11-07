
import java.util.Scanner;


public class Week2 {
    public static void main(String[] args) {
        People me=new People("mars");
        me.setname("Franklin");
        me.setage(100000);
        me.setnation("IMC");
        // System.out.println(person1.toString());

        
        Lecturer op=new Lecturer(3.3);
        Student st=new Student("Mars",4.9);
        BankAccount a=new BankAccount(me);
        BankAccount b=new BankAccount(me);
        // System.out.println(a.angetter());
        // System.out.println(b.angetter());
        //when b was constructed, the static contribute nextAccountnumber has already been increced to 1 when a was constructed.
        a.deposite(99.9);
        System.out.println(a.getbalance());
        a.withdraw(7.28);
        System.out.println(a.getbalance());
        b.deposite(50.0);
        // System.out.println(b.getbalance());
        // System.out.println(a.toString());
        // System.out.println(b.toString());
        // a.transferFunds(6.4, b);
        // System.out.println(a.toString());
        System.out.println(op);
    }
}
