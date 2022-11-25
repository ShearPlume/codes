package Generics;

class B1 implements IB<Integer> {
    @Override
    public Integer test(Integer t) {
        return t;
    }

    public static void main(String[] args) {
        B1 bi=new B1();
        System.out.println(bi.test(1));
    }
}