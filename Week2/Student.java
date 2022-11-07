import java.util.concurrent.atomic.DoubleAdder;

public class Student extends People{
    private double GPA;
    public Student(String na,double G)
    {
        super(na);
        this.GPA=G;
    }
    public double getGPA()
    {
        return this.GPA;
    }
    public void setGPA(int G)
    {
        this.GPA=G;
    }
    public String toString()
    {
        return(super.toString()+" GPA: "+GPA);
    }
    
}
