package quiz2;

public class LabelledPoint extends Point{
    private String label;
    public LabelledPoint(int x, int y) {
        super(x,y);
        label = "";
        }
        

    public boolean isValid() {
        return super.isValid() && l.length() >= 0;
    }


}
