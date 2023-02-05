package file2727182y;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public class Directory implements Component {
    Directory fatherDir;// we need to give a father attribute to every directory, and assign to it when
                        // its father add it, so that when itself add a file, we can inform its father
                        // and his father that file's size by the reference.
    private ArrayList<Component> children;
    String name;
    int size;

    public void setFather(Directory f) {
        // TODO Auto-generated method stub
        this.fatherDir = f;

    }

    public Directory(String name) {
        this.name = name;
        this.fatherDir = null;// initialize it to null
        children = new ArrayList<Component>();
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

        String outcome = name + " (count=" + children.size() + ", size=" + size + ")";
        if (children.size() > 0)
            outcome += "\n";// add \n only if dictonary has children
        int count = 0;
        for (Component a : children) {
            outcome += a.display(prefix);
            count++;//
            if (count != children.size())
                outcome += "\n";
        }

        // System.out.println(outcome);
        return outcome.replace("\n", "\n" + prefix);// this code is to make sure each time the file tree extends, an
                                                    // extra prefix will be added to each line of the tree,using the
                                                    // recursion and
                                                    // replace function to add an extra prefix，Each time a loop is
                                                    // made, all line breaks in the text will be replaced with "line
                                                    // break + prefix", so that only one prefix will be added to the
                                                    // leaves, and more will be added to the upper leaves
                                                    // , and the root at the top will add n times prefix at the front,
                                                    // where n is the depth of the tree
    }

    @Override
    public Component search(String name) {
        // TODO Auto-generated method stub
        for (Component a : children) {
            if (a.getName() == name)// if name matches, return this
                return this;
            else if (a.getClass() == Directory.class)// only continue to use search method if this.type is directory
                return a.search(name);
        }
        return null;
    }

    public void refreashSize(int newsize, Boolean addorminus)// if the bool is true, add size, otherwise minus size
    {
        if (addorminus)
            this.size += newsize;
        else
            this.size -= newsize;
        if (this.fatherDir != null)
            this.fatherDir.refreashSize(newsize, addorminus);// if this has fatherdir, it need to refreashsize as well.
    }

    void add(Component c) {// c means the subdir or file to add.
        children.add(c);
        if (c instanceof Directory)// if c is a Directory, we need to set its father with this
        {
            Directory temp = (Directory) c;
            temp.setFather(this);
            c = temp;// set father
        }
        if (c instanceof File)// if c is a File, we need to recaculate this.size and all its fatherdir's size;
        {
            this.refreashSize(c.getSize(), true);
        }

    }

    void remove(Component c) {
        children.remove(c);
        if (c instanceof File)// if c is a File, we need to recaculate this.size and all its fatherdir's size;
        {
            this.refreashSize(c.getSize(), false);
        }
    }

}
