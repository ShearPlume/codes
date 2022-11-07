public class Lecturer extends People{
    private double salary;
    public Lecturer(double s)
    {
        super("UofG");
        this.salary=s;
    }
    public double getsalary()
    {
        return this.salary;
    }
    public void setsalary(int S)
    {
        this.salary=S;
    }
    public String toString()
    {
        return(super.toString()+" GPA: "+salary);
    }
}
