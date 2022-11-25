package Interface;



public class interface1 extends Creature implements Greeing {
    public int n;
    public interface1(String n)
    {
        super(n);
    }
    public void Sayhi() {
        System.out.println("HI! HOW ARE U?");
    }
    public void sedtn()
    {
        System.out.println("asd");
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getname();
    }
    public static void main(String[] args) {
        Greeing inter1=new interface1("DOG");
        Greeing inter2=new interface1("HUMAN");
        inter1.Sayhi();
        System.out.println(inter1.toString());
        System.out.println(inter1.equals(inter2));
        inter2=inter1;
        System.out.println(inter1.equals(inter2));   
        System.out.println(inter1.getClass());   
        System.out.println(inter1); 
    }
    

}
