package Week3;

public class TestExpand {
    public static void main(String[] args) {
    ExpandableArray ea = new ExpandableArray();
    for(int i=0;i<10;i++) {
    ea.add(i);
    }
    System.out.println(ea);
    System.out.println(ea.getLength());
    ea.add(10);
    System.out.println(ea);
    System.out.println(ea.getLength());
    }
    }