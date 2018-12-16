
public class Dice {
	private int numSides; 
	
	public Dice() { 
		setnumSides (numSides); 
	}
	
	public void setnumSides (int ns) { 
		if (ns == 4 || ns == 6 || ns == 8 || ns == 10 || ns == 12|| ns == 20) { 
			numSides = ns; 
		} else { 
			System.out.println( " invalid # of sides defaulting to 4 ");
			numSides = 4; 
		}
	}
	public int getnumSides (int ns) { 
		return numSides; 
	}
	public int roll () { 
		int roll = (int) (Math.random()* numSides); 
		return roll; 
	}
	public String toString() { 
		return "\n Side Num " + numSides; 
	}
}
