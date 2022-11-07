public class BankAccount {
    // private  String name;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber =0;
    private People accountHolder;
    public void setholder(People holder)
    {
        this.accountHolder=holder;
    }
    public String toString()
    {
        return("name: "+this.accountHolder.getname()+" accountnumber: "+this.accountNumber+" balance: "+this.balance);
    }

    public BankAccount(People p)
    {
        // this.name=n;
        this.accountHolder=p;
        this.balance=0;
        this.accountNumber=this.nextAccountNumber;
        this.nextAccountNumber+=1;
    }
    public int angetter()
    {
        return this.accountNumber;
    }
    public double getbalance()
    {
        return this.balance;
    }
    public void deposite(Double amount)
    {
        this.balance+=amount;
    }
    public void withdraw(Double amount)
    {
        this.balance-=amount;
    }
    public void transferFunds(double amount, BankAccount target)
    {
        this.balance-=amount;
        target.deposite(amount);
    }
}
