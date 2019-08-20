
public class Animal { //a class to display the attributes of an animal
	private int numTeeth = 0; //declaring attributes
	private boolean spots = false;
	private int weight = 0;
	
	public Animal(int numTeeth, boolean spots, int weight){ //declaring the animal class
		this.setNumTeeth(numTeeth); //declaring keywords
		this.setSpots(spots);
		this.setWeight(weight);
	}
	
	public int getNumTeeth(){ //method returns the variable value
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) { //sets the value
		this.numTeeth = numTeeth;
	}
	
	public boolean getSpots() { //method returns the variable value
		return spots;
	}

	public void setSpots(boolean spots) { //sets the value
		this.spots = spots;
	}

	public int getWeight() { //method returns the variable value
		return weight;
	}

	public void setWeight(int weight) { //sets the value
		this.weight = weight;
	}
	
	public String toString() { //string representation of the object
        return("No of teeth: "+ numTeeth 
                + "\n"
                + "Animal has spots: "+ spots
                + "\n"
                + "Animal's weight: " + weight
                + "\n"); 
    }  
}

class Cheetah extends Animal { // a subclass which extends to Animal
	private boolean veg; // create a variable specific for this class
	public static String[] colours; //create static variable for this class
	static {colours = new String[3]; 
		colours[0] = "Yellow";
		colours[1] = "Brown";
		colours[2] = "Black";}
	
	public Cheetah (int numTeeth, boolean spots, int weight, boolean veg) { //declaring the cheetah class
		super(numTeeth, spots, weight); //refers to attributes in the animal class
		this.setVeg(veg);
        
	}

	public boolean getVeg() { //method returns the variable value
		return veg;
	}
	
	public void setVeg(boolean veg) { //sets the value
		this.veg = veg;
		
	}
	
	public String toString() //to String method, string representation of the object
    { 
		
        return (super.toString()+  //attributes in the animal class
        		"Animal's colours: " + colours
        		+ "\n"
        		+ "Is the animal a vegetarian: " + veg); 
    } 
}