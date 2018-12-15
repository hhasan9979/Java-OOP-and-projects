public class Primes
{
	public static boolean isPrime(int num)
	{
        
        if (num < 2)
        	return false;
        if (num == 2)
        	return true; 
        if (num % 2 == 0)
        	return false; 
        		
       	int maxTestFactor = (int)(Math.sqrt(num));
       	for (int i = 3; i < maxTestFactor; i = i + 2)
       		if(num % i == 0)
       			return false; 
       		return true;  
	}
	
	public static int[] getPrimes(int start, int numberOfPrimes)
	{
		int[] primeNum = new int[numberOfPrimes]; 
		int num = 0; 
		while (numberOfPrimes > num)
		{
			
			num++
		}
	}
	
	public static int[] getPrimesWithinRange(int minValue, int maxValue)
	{
		int num = 0; 
		for(int i = minValue; i < maxValue; i++)
		{
			if(i.isPrime)
			num++; 
				
		}
		int[] primes = new int[num]; 
		for (int i = minValue; i < maxValue; i++)
		{
			if(i.isPrime)
			primes[i - minValue] = i; 
		}
		return primes; 
	}
	
	public ArrayList<Integer> getPrimesListWithinRange(int minValue, int maxValue)
	{
		
	}
}