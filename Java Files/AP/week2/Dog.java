package AP.week2;

public class Dog extends Pet{
    String breed;
    String furColor;
    String favouriteToy;
    Dog(String n,int a)
    {
        super(n,a);
    }
    Dog(String n,int a,String ibreed,String ifurColor,String ifavouriteToy)
    {
        super(n,a);
        breed=ibreed;
        furColor=ifurColor;
        favouriteToy=ifavouriteToy;
    }



    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name+" is a "+breed+" and enjoys playing with "+favouriteToy+" every afternoon.";
    }

    void provideBone()
    {
        System.out.println(name+" says thanks for the bone!");
    }

}
