public class HighLowGame
{
	public static void main(String[] args)
	{
		int guess = 0;
		int x = 0;
		char conf = ' ';
		
		do
		{
		int rand = (int)(Math.random()*200+1);
		x = 0;
		do
		{
			
			System.out.print("Guess my random number! (Between 1 and 200): ");
			guess = SavitchIn.readLineInt();
			
			while((guess > 200) || (guess < 1))
			{
				System.out.print("Invalid! Please try again: ");
				guess = SavitchIn.readLineInt();
			}
			
			if (guess > rand)
			{
				System.out.println("Lower!");
			}
			else if (guess < rand)
			{
				System.out.println("Higher!");
			}
			
			x++;
		}while(guess != rand);
		
		System.out.println("\nGood job! That took you " + x + " guesses!");
		System.out.print("Would you like to play again? (Y/N): ");
		conf = SavitchIn.readLineNonwhiteChar();
		
		}while ((conf == 'Y') || (conf == 'y'));
	}
}		