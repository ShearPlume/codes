package file2727182y;
import java.util.ArrayList;

public class Directory implements Component {
    private ArrayList<Component> children;
    String name;
    int size;

    public Directory(String name) {
        this.name = name;
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
        int size =0;
        for(Component c: children)
        {
            size += c.getSize();
        }
        return size;
    }

    @Override
    public int getCount() {
        int count =0;
        // TODO Auto-generated method stub
        for(Component c: children)
        {
            count+=c.getCount();
            
        }
        return count;
    }

    @Override
    public String display(String prefix) {
        // TODO Auto-generated method stub

        String outcome = name + ": (count=" + this.getCount() + ", size=" + this.getSize() + ")";
        for (Component a : children) {
            outcome += "\n"+a.display(prefix);
        }

        // System.out.println(outcome);
        return outcome.replace("\n", "\n" + prefix);// this code is to make sure each time the file tree extends, an
                                                    // extra prefix will be added to each line of the tree,using the
                                                    // recursion and replace function to add an extra prefix，Each time a
                                                    // loop ismade, all line breaks in the text will be replaced with
                                                    // "linebreak + prefix", so that only one prefix will be added to
                                                    // theroot, and more will be added to the lower branches, and the
                                                    // leaves at the bottom will add n times prefix at thefront, where n
                                                    // is the depth of the tree
    }

    @Override
    public Component search(String name) {
        // TODO Auto-generated method stub
        for (Component a : children) {
            if (a  instanceof Directory)/// only continue to use search method if this.type is directory
            return a.search(name);
            else if (a.getName() == name)//if name matches and this is a file, return this(a's father dir)
            return this;
                
        }
        return null;
    }

    void add(Component c) {// c means the subdir or file to add.
        children.add(c);
    }

    void remove(Component c) {
        children.remove(c);
    }

}
