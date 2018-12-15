public class Coin
{
	private double headsProb; // instant variables are private to the class
	
	public Coin()
	{
		headsProb = 0.5; 
	}
	
	public Coin(double hProb)
	{
		if (hProb < 0.0 || hProb > 1.0)
			headsProb = 0.5; 
		else 
			headsProb = hProb; 
	}
	
	public Coin(double hProb, double tProb)
	{
		double totalhandt = (hProb /(hProb + tProb)); 
		
		if (hProb < 0.0 || hProb > 1.0)
			headsProb = 0.5; 
		else 
			headsProb = hProb; 
	}
	
	public String toss()
	{
		double flip = Math.random();
		if (flip < headsProb)
			return "heads"; 
		else 
			return "tails";
	}
}