package Yujingsi;


import java.util.ArrayList;
import java.util.List;

public class Directory implements Component {

    private List<Component> componentList = new ArrayList<Component>();
    private String name;
    public static String fixprefix;
    static int dep;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Component component : componentList) {
            size += component.getSize();
        }
        return size;
    }

    @Override
    public int getCount() {
        int count = 0;
        for (Component component : componentList) {
            count += component.getCount();
        }
        return count;
    }


    @Override
    public String display(String prefix) {
        // TODO Auto-generated method stub
        String out = name + ": (count=" + this.getCount() + ", size=" + this.getSize() + ")";
        StringBuilder sb =new StringBuilder(out);
        for(int i=0;i< dep;i++)
        {
            sb.insert(0,prefix);
        }
         dep++;
        for (Component a : componentList) {
            sb.append("\n");
            
            if(a.getClass()==Directory.class)
            {
                sb.append(a.display(prefix));
            }
            else
            {
                StringBuilder sb1=new StringBuilder();
                for(int i=0;i< dep;i++)
                {
                    sb1.insert(0,prefix);
                }
                sb1.append(a.display(prefix));
                sb.append(sb1.toString());
            }
            
        }
         dep=0;//set  dep to 0 
        return sb.toString();
    }

    @Override
    public Component search(String name) {
        for(Component c:componentList)
        {
            if(c instanceof Directory)
            {
                return c.search(name);
            }
            else if(c.getName()==name)
            return this;
        }
        return null;

    }



    public Directory(String name) {
        this.name = name;

    }

    public void add(Component courseworkpdf) {
        componentList.add(courseworkpdf);
    }

    public void remove(Component courseworkzip) {
        componentList.remove(courseworkzip);
    }
}
