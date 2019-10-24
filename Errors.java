public class Errors
{
	public static void main(String[] args)
	{
		double grade = 0;
		
		System.out.print("Hello! Please enter your score, withour the percentage sign: ");
		grade = SavitchIn.readLineDouble();
		
		while ((grade > 100) || (grade <= 0))
		{
			System.out.print("\nInvalid score! Please try again: ");
			grade = SavitchIn.readLineDouble();
		}
		
		if (grade > 90)
		{
			System.out.println("\nCongradulations! You got an A!\n");
		}
		else if (grade > 80)
		{
			System.out.println("\nOk! You got a B!\n");
		}
		else if (grade > 70)
		{
			System.out.println("\nYou got a C! Good enough.\n");
		}
		else if (grade > 65)
		{
			System.out.println("\nYou got a D! Try harder!\n");
		}
		else
		{
			System.out.println("You got an F! You're a disgrace!");
		}
	}
}