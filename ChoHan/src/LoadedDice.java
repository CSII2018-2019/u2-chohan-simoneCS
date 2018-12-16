
public class LoadedDice extends Dice {
	private int numSides; 
	
	
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
        // double in the range [0.0, 1.0)
        double r = Math.random();

        // integer in the range 1 to 6 with desired probabilities
        int roll1;
        if      (r < 1.0/8.0) roll1 = 1;
        else if (r < 2.0/8.0) roll1 = 2;
        else if (r < 3.0/8.0) roll1 = 3;
        else if (r < 4.0/8.0) roll1 = 4;
        else if (r < 5.0/8.0) roll1 = 5;
        else                  roll1 = 1;
        int roll = (int) (roll1* numSides); 
        return roll; 
	}
	public String toString() { 
		return "\n Side Num " + numSides; 
	}

}


