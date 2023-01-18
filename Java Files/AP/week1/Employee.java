package AP.week1;

public class Employee {
    String name;
    int ID;
    double salary;
    String department;
    static int numofes;
    Employee()
    {
        
    }

    Employee(String name,double sal,String dep)
    {
        this.name=name;
        this.salary=sal;
        this.department=dep;
    }

    void editName(String ename)
    {
        this.name=ename;
    }

    static void Printnumofe()
    {
        System.out.println(numofes);
    }
    public static void main(String[] args) {
       

    }
}
