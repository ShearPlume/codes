package AP.week2;

public class Pet extends AbstractPet {

    public Pet(String n, int a) {
        super(n, a);
        // TODO Auto-generated constructor stub
    }
    // yes, beacuse we already have a constructor which has paramaters, so we need
    // // to explicitly call the parent class constructor in its own constructor

    public Pet(String n) {
        super(n, 0);
    }

    void setname(String n) {
        if (n != "")
            this.name = n;
    }

    String getname() {
        return this.name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name + " is my pet and is aged " + age;
    }

}
