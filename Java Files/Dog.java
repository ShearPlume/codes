public class Dog extends test {
    protected boolean cute;

    public Dog(int legs, boolean cute) {
        super(legs);
        this.cute = cute;
    }

    public String toString() {
        return "I have "  + " legs";
    }
}