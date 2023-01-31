package quiz2;

public class Point {
    private int x, y;
    public Point(int x,int y)
    {

    }

    public boolean isValid() {
        return x >= 0 && y >= 0;
    }

}
