package Reflection;
import java.lang.reflect.*;
public class TClass {
    

    

    public static void main(String[] args) {
        BIrd tt=new BIrd();
        tt.weight=1;
        tt.wingSpan=2;
        Class<?> tweetyClass = tt.getClass();
        System.out.println(tweetyClass.getName());
        Field[] birdFields = tweetyClass.getFields();
        System.out.println(tweetyClass.getSimpleName());
        System.out.println(birdFields.length);
        System.out.println(birdFields[1].getName());
        System.out.println(birdFields[2].getName());
        System.out.println(birdFields[1].getType().getName());
        Field[] birdDeclFields = tweetyClass.getDeclaredFields();
        System.out.println(birdDeclFields.length);
        // tt.weight=2;
    }
}
