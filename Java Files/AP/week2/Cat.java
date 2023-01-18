package AP.week2;

public class Cat extends Pet{
    String breed;
    String furColor;
    String favoruteSpot;
    Cat(String n,int a)
    {
        super(n,a);
    }
    Cat(String n,int a,String ibreed,String ifurColor,String ifavoruteSpot)
    {
        super(n,a);
        breed=ibreed;
        furColor=ifurColor;
        favoruteSpot=ifavoruteSpot;
    }
    public String toString() {
        // TODO Auto-generated method stub
        return name+" is a "+breed+" and enjoys staying at "+favoruteSpot+" pls do not bother them.";
    }
}
