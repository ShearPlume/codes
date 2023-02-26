package Yujingsi;

import java.util.ArrayList;
import java.util.List;

public class File implements Component{

    private String name;
    private int size;
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String display(String prefix) {
        return getName()+"("+size+")";
    }

    @Override
    public Component search(String name) {
        return null;
    }



    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
}
