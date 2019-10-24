public class AvgLoop
{
	public static void main(String[] args)
	{
		int scoreNum = 0;
		int x = 0; //counter
		double scoreTot = 0;
		double score = 0;
		double av = 0;
		int even = 0;
		int odd = 0;
		int pass = 0;
		int fail = 0;
		
		System.out.println("Hello, and welcome to the score average-omatic! How many scores will you be entering? (Maximum 10)");
		scoreNum = SavitchIn.readLineInt();
		
		while ((scoreNum > 10) || (scoreNum <= 0))
		{
			System.out.print("\nInvalid number! Please try again: ");
			scoreNum = SavitchIn.readLineInt();
		}
		
		while (x < scoreNum)
		{
			System.out.print("Ok! Please enter score #" + (x + 1) + ": ");
			score = SavitchIn.readLineInt();
			
			scoreTot = scoreTot + score;
			x = x + 1;
			
			if (score%2 == 0)
			{
				even = even + 1;
			}
			else
			{
				odd = odd + 1;
			}
			
			if (score < 65)
			{
				fail = fail + 1;
			}
			else
			{
				pass = pass + 1;
			}
		}
		
		av = scoreTot / scoreNum;
		
		System.out.println("\nGreat! Your average is " + av + "% \n" + even + " of those scores were even, and " + odd + " of those scores were odd. \n" + pass + " of those grades were passing, and " + fail + " of those scores failed.\n\nGoodbye!\n");
	}
}