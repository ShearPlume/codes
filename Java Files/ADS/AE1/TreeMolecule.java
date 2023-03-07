package AE1;
//add name and id as comment

import java.util.ArrayList;
import java.util.List;

//add import statement

public class TreeMolecule implements Molecule {

    private Atom first;
    private ArrayList<Atom> children;

    public TreeMolecule(Atom c) {
        first = c;// basic carbon atom
        children = new ArrayList<Atom>();
    }

    @Override
    public boolean addBond(Atom a1, Atom a2, int strength) {
        // TODO Auto-generated method stub
        if (this.contains(a1)) {
            Bond b = new Bond(a2, strength);
            if (a1.addBond(b))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Atom a) {
        // TODO Auto-generated method stub
        return first.searchExistenceOfAtom(a)==null?false:true;//if result is null then the tree does not contain atom a
    }

    @Override
    public String smilesString() {
        // TODO Auto-generated method stub
        // int a=0;
        return  first.createSubSmileString();//add base carbon atom in the front
    }

    @Override
    public String structuralFormula() {
        // TODO Auto-generated method stub
        return first.createSubStructure();
    }

    // add constructor, implemented methods and any helper methods you require

}
