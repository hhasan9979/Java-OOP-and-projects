public class NumberCube
{
	public static final int MIN_SIDES = 4; // the word "final" makes it a constant
	public static final int MAX_SIDES = 10;
	public static final int DEFAULT_SIDES = 6;
	
	private int numOfSides; 
		
	public NumberCube() //name of the class is the name of the constructor // constructor does not return anything
	{
		this(DEFAULT_SIDES); // this is telling it to call the method that recieves one input
		//numOfSides = DEFAULT_SIDES; 
	}
	
	public NumberCube(int sidenum)
	{
		if (sidenum < MIN_SIDES || sidenum > MAX_SIDES)
			numOfSides = DEFAULT_SIDES;
		else
			numOfSides = sidenum; 
	}
	
	public int roll() // methods are what the thing can do such as roll and get number of sides
	{
		return
			(int)(Math.random() * numOfSides) + 1; 
	}
	
	public int getNumOfSides()
	{
		return numOfSides; 
	}
}