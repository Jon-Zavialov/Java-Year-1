public class Primes
{
	public static void main(String[] args)
	{
		int num = 0;
		
		System.out.println("Please enter a whole, positive number between 1 and 20");
		num = SavitchIn.readLineInt();
		
		if((num < 1) || (num > 20))
		{
			System.out.println("\nInvalid!\n");
		}
		else if(num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || num == 13 || num == 17 || num == 19)
		{
			System.out.println("\nPrime!\n");
		}
		else
		{
			System.out.println("\nNot prime!\n");
		}
	}
}  