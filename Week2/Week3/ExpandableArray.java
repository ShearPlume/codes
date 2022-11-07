package Week3;

public class ExpandableArray {
    private int[] myArray = new int[10]; // initial size
    private int pos = 0; // next pos to add into

    public void add(int a) {
        if (pos >= myArray.length) {
            // array needs to be made bigger
            int currentLength = myArray.length;
            int newLength = currentLength + 10;
            int[] newArray = new int[newLength];
            // copy into new one
            for (int i = 0; i < currentLength; i++) {
                newArray[i] = myArray[i];
            }
            // reset the reference
            myArray = newArray;
        }
        myArray[pos++] = a;
    }

    public String toString() {
        String line = "";
        for (int i = 0; i < pos; i++) {
            line += myArray[i] + ", ";
        }
        return line;
    }

    public int getLength() {
        return myArray.length;
    }
}
