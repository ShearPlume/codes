package AE1;
//add name and id as comment

import java.util.ArrayList;
import java.util.List;

//add import statement

public class TreeMolecule implements Molecule {

    private Atom first;
    // private ArrayList<Atom> children;

    public TreeMolecule(Atom c) {
        first = c;// basic carbon atom
        // children = new ArrayList<Atom>();
    }

    @Override
    public boolean addBond(Atom a1, Atom a2, int strength) {
        // TODO Auto-generated method stub
        if (this.contains(a1) && a2.getValency() >= strength) {
            Bond b = new Bond(a2, strength);
            if (a1.addBond(b))
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public static Atom searchExistenceOfAtom(Atom thisatom, Atom target) {
        if (thisatom == target)
            return thisatom;
        else if (thisatom.getBonds().size() > 0) {
            for (Bond b : thisatom.getBonds())// DFS
            {
                Atom tempAtom = searchExistenceOfAtom(b.getChild(), target);// Recursion
                if (tempAtom != null)
                    return tempAtom;
            }
        }
        return null;
    }

    @Override
    public boolean contains(Atom target) {
        return searchExistenceOfAtom(first, target) == null ? false : true;// if result is null then the tree does not
                                                                           // contain atom a
    }

    @Override
    public String smilesString() {
        // TODO Auto-generated method stub
        // int a=0;
        return createSubSmileString(first);// add base carbon atom in the front
    }

    public static String createSubSmileString(Atom thisAtom) {
        if (thisAtom.getBonds().size() == 0)// if have no children
            return thisAtom.getElement();
        else {
            String s = thisAtom.getElement();
            for (Bond b : thisAtom.getBonds()) {
                String bondValue = "";
                switch (b.getWeight()) {
                    case 2:
                        bondValue = "=";
                        break;
                    case 3:
                        bondValue = "#";
                        break;
                    default:
                        break;
                }
                if (thisAtom.getBonds().size() > 1)
                    s += "(" + bondValue + createSubSmileString(b.getChild()) + ")";// if this atom has more than
                                                                                    // one bond, add parentheses
                                                                                    // before and after
                else
                    s += bondValue + createSubSmileString(b.getChild());// only 1 atom bond, no need to add parentheses
            }
            return s;
        }

    }

    public static String createSubStructure(Atom thisAtom) {
        String withHydrogen = thisAtom.getElement();
        if (thisAtom.getValency() > 0) {// number of H to add depends on the remaining valency
            if (thisAtom.getValency() == 1)
                withHydrogen += "H";
            else
                withHydrogen += "H" + thisAtom.getValency();
        }
        if (thisAtom.getBonds().size() == 0)// if have no children
            return withHydrogen;
        else {
            String s = withHydrogen;
            for (Bond b : thisAtom.getBonds()) {
                String bondValue = "";
                switch (b.getWeight()) {
                    case 2:
                        bondValue = "=";
                        break;
                    case 3:
                        bondValue = "#";
                        break;
                    default:
                        break;
                }
                if (thisAtom.getBonds().size() > 1)
                    s += "(" + bondValue + createSubStructure(b.getChild()) + ")";// if this atom only has more than
                                                                                  // one bond, add parentheses before
                                                                                  // and after
                else
                    s += bondValue + createSubStructure(b.getChild());// only 1 atom bond, no need to add parentheses
            }
            return s;
        }
    }

    @Override
    public String structuralFormula() {
        // TODO Auto-generated method stub
        return createSubStructure(first);
    }

    // add constructor, implemented methods and any helper methods you require

}
