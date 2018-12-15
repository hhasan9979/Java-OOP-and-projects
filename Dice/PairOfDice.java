public class PairOfDice
{
	private NumberCube die1; 
	private NumberCube die2; 
	
	public PairOfDice()
	{
		this(new(NumberCube());
	}
	
	public PairOfDice(NumberCube theCube)
	{
		this(theCube, theCube); 
	}
	
	public PairOfDice(NumberCube d1, NumberCube d2)
	{
		die1 = d1; 
		die2 = d2; 
	}
	
	public int roll()
	{
		return 
			die1.roll() + die2.roll();
	}
	
	public int getHighestPossibleRoll()
	{
		return 
			die1.getNumOfSides() + die2.getNumOfSides(); 
	}
}