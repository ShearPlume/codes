package quiz2;

public class Person {
    public static <T> String arrayPrint(T[] a) {
        String temp = "";
        for (int i = 0; i < a.length; i++) {
            temp += a[i].toString();
        }
        return temp;
    }

    public static void main(String[] args) {
        Integer[] a = { 3, 4 };
        String[] b = { "ILove", "Java" };
        System.out.print(arrayPrint(a));
        System.out.print(arrayPrint(b));
    }
}