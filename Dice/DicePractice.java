public class DicePractice
{
	public static int DEFAULT_NUM_OF_ROLLS = 100; 
		
	private PairOfDice myDice; 
	private int numOfRolls; 
	private int[] rolls; 
	private int[] theoreticalRolls; 
		
	public DicePractice(PairOfDice dice) // "this" indicates from the field not the parameter
	{
		this(dice, DEFAULT_NUM_OF_ROLLS); // calls another constuctor of the same class
	}

	public DicePractice(PairOfDice dice, int numberOfRolls)
	{
		myDice = dice; 
		numOfRolls = numberOfRolls;
		rolls = new int[myDice.getHighestPossibleRoll() + 1];
		rollDice(); 
		printRolls(); 
	}
	
	public void rollDice()
	{
		for (int i = 0; i < numOfRolls; i++)
		{
			rolls[myDice.roll()]++; //go into the position and increments that value (ex. if i roll a 6, it goes to 6 and ++ 
			
		}
	}
	
	public void printRolls()
	{
		for (int i = 2; i < rolls.length; i++)
		{
			System.out.println("[" + i + "] = " + rolls[i]);
		}
		System.out.println(); 
	}
	
	public static void main (String[] args)
	{
		NumberCube d1 = new NumberCube(); 
		NumberCube d2 = new NumberCube(); 
		PairOfDice theDice = new PairOfDice(d1, d2); 
		
		DicePractice dp1 = new DicePractice(theDice, 1000);
		
		DicePractice dp2= new DicePractice(theDice);
	}
}