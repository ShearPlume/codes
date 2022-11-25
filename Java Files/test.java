import java.util.ArrayList;
import java.util.List;

public class test {
    public static int a;
    public test(int m)
    {
        this.a=m;
    }
    public static void main(String[] args) {
        List <String>list = new ArrayList();
        list.add("22");
        list.add("33");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((String)list.get(i));
        }
    }

}
