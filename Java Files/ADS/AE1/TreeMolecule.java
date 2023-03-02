package AE1;
//add name and id as comment

//add import statement



public class TreeMolecule implements Molecule {

	private Atom first;
        public TreeMolecule(Atom c)
        {
                first=c;//basic carbon atom

        }
        @Override
        public boolean addBond(Atom a1, Atom a2, int strength) {
            // TODO Auto-generated method stub
            if(this.contains(a1))
            {

                return true;
            }
            
            else{

                return false;
            }
        }

        @Override
        public boolean contains(Atom a) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public String smilesString() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String structuralFormula() {
            // TODO Auto-generated method stub
            return null;
        }

	
        //add constructor, implemented methods and any helper methods you require

	
	
	
}
