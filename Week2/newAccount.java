

public class newAccount extends BankAccount{
    private double interestRate;
    public double getRate()
    {
        return interestRate;
    }
    public newAccount(double rate,People p)
    {
        super(p);
        interestRate=rate;
    }
    public void withdraw(Double amount)
    {
        if(this.getbalance()<=amount)
        System.out.println("Your balance can not go below 0.");
        this.withdraw(amount);
    }
    public void addinterest()
    {
        this.deposite(this.getbalance()*this.getRate()/100.0);
    }
    
}
