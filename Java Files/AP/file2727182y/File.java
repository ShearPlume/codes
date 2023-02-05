package file2727182y;

public class File implements Component {
    String name;
    int size;
    Component fatherDir;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        return size;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String display(String prefix) {
        // TODO Auto-generated method stub
        return name + " (" + size + ")";
    }

    @Override
    public Component search(String name) {
        // TODO Auto-generated method stub
        return null;
    }

}
