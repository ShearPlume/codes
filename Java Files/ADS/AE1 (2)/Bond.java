package AE1;
//add name and id as comment
//add import statements

//a bond is a pair (Atom, weight) 
public class Bond {
	
	private Atom child;
	private int weight;
	//add constructor, getters setters
	
	public Bond(Atom child,int weight)
	{
		this.child=child;
		this.weight=weight;
		
	}
	
	public Atom getChild()
	{
		return child;
	}
	
	public void setChild(Atom c)
	{
		child=c;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int w)
	{
		weight=w;
	}

        //and any other methods you require (if any)
	

}
