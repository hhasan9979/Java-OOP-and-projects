import java.util.Scanner;
import java.util.Random; 

public class Gameproject
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//this is the main menu
			System.out.println("Welcome to the MY GAME!");
			System.out.println("1. Beginner"); 
			System.out.println("2. Intermediate");
			System.out.println("3. Advanced");
			System.out.println("4. Expert");
			
		int numberOfAttempts = 0; //attempts for selecting a level
		
		int gameTries = 0; //attempts for guessing a number
		
		int guess = 0; //input for the guessing the secret number	
		
		while (numberOfAttempts < 3)
		{
			
			System.out.println("Enter a level from 1 through 4");
			int levels = scan.nextInt(); 
			
			if (levels  == 1 || levels  == 2 || levels  == 3 || levels  == 4)
			{
				System.out.println("You are attempting LEVEL " + levels + "."); 
					//Working on the game below this
				System.out.println(); 
					
				int result = (int)Math.pow(10, levels);  
					
				Random r = new Random(); 
				int secretnum = (r.nextInt(result) + 1); //picks a random number within the interval
				System.out.println("Let's begin the game!");
				
				//System.out.println(result);
				while(guess != secretnum)
				{
					System.out.println("Guess a number between 1 and " + result);
					guess = scan.nextInt();
					
					if (guess == secretnum)
					{
						System.out.println("You are correct");
					}	
					else if (guess > secretnum)
					{
						System.out.println("You are too high!");
					}
					else if (secretnum > guess)
					{
						System.out.println("You are too low!");
					}
					
					gameTries++; 
				}
				System.out.println("The number is " + secretnum + ". You have won the game! WooHoo!!");
				System.out.println("You got it after " + gameTries + " tries only!");
		 		return;
			}
			
			else 
			{
				System.out.println("You have to pick a number between 1 and 4.");
				numberOfAttempts++; 
			}
		}
		System.out.println("YOU HAVE EXCEEDED YOUR LIMIT"); 
		 
		
	}
}