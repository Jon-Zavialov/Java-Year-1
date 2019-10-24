import java.util.Random;
public class RandTest
{
	public static void main(String[] args)
	{

	Random rand = new Random();
	char conf = ' ';

	// Obtain a number between [0 - 49].
	int n = rand.nextInt(101);

	// Add 1 to the result to get a number from the required range
	// (i.e., [1 - 50]).
	n += 1;
	
	System.out.println("Come up with a number between 1 and 100. I garuntee i can guess it in less than 8 questions! Input y once you have your number.");
	conf = SavitchIn.readLineNonwhiteChar();
	
	if conf == 'Y'
	{
		System.out.println("Ok! Is it greater than 50? \nY = Yes! \nN = No! \nG = you guessed it!")
		conf = SavitchIn.readLineNonwhiteChar();
		
		if conf == 'Y'
		{
			System.out.println("Ok! is it greater than 75? \nY = Yes! \nN = No! \nG = you guessed it!");
			conf = SavitchIn.readLineNonwhiteChar();
			
			if conf == 'Y'
			{
				System.out.println("Ok! is it Greater than 78? \nY = Yes! \nN = No! \nG = you guessed it!");
				conf = SavitchIn.readLineNonwhiteChar();
			}
			else if conf == 'N'
			{
				System.out.println("Ok! is it") //i gave up here
			}
		}
		else if conf == 'N'
		{
			System.out.println("Ok! is it greater than 25? \nY = Yes! \nN = No! \nG = you guessed it!");
			conf = SavitchIn.readLineNonwhiteChar();
		}
		else if conf == 'G'
		{
			System.out.println("A new personal record! Goodbye!");
			System.exit(2);
		}
		else
		{
			System.out.println("WRONG! Get out of here!");
			System.exit(2);
		}
	}
	else
	{
		System.out.println("WRONG! Get out of here!");
		System.exit(2);
	}