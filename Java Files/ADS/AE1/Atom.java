package AE1;
// Add name and id as comment

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// and import statements

public class Atom {

	private String element;
	private List<Bond> bonds = new ArrayList<Bond>();// the bonds to child atoms
	private int valency;

	public Atom(String type) {
		element = type;
		valency = (int) VALENCY_MAP.get(type);
	}

	// this map has been included to help you look up valencies
	// but you can ignore it (and delete it) if you want to use something else

	private static final Map<String, Integer> VALENCY_MAP = createMap();

	private static Map<String, Integer> createMap() {
		Map<String, Integer> result = new HashMap<>();
		result.put("H", 1);// hydrogen
		result.put("C", 4);// carbon
		result.put("B", 3);// boron
		result.put("N", 3);// nitrogen
		result.put("O", 2);// oxygen
		result.put("Fl", 1);// fluorine
		result.put("P", 3);// phosphorous
		result.put("S", 2);// sulphur
		result.put("Cl", 1);// fluorine
		result.put("Br", 1);// bromine

		return Collections.unmodifiableMap(result);
	}

	// now add all of the Atom constructors and methods you require

	public int getValency() {
		return valency;
	}

	public void reduceValency(int reduction) {
		valency -= reduction;
	}

	public String getElement() {
		return element;
	}

	public List<Bond> getBonds() {
		return bonds;
	}

	public boolean addBond(Bond bond) {
		if (this.valency >= bond.getWeight()) {
			this.bonds.add(bond);
			this.valency -= bond.getWeight();// this atom needs to reduce valency
			bond.getChild().reduceValency(bond.getWeight());// child also needs to reduce valency
			return true;
		} else
			return false;
	}
}
