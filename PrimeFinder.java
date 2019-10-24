public class PrimeFinder
{
	public static void main(String[] args)
	{
		int num = 0;
		int remain2 = 0;
		int remain3 = 0;
		int remain5 = 0;
		
		System.out.println("Please enter a whole number between 1 and 100.");
		num = SavitchIn.readLineInt();
		
		remain2 = num%2;
		remain3 = num%3;
		remain5 = num%5;
		
		if((num >= 100) || (num < 1))
		{
			System.out.println("It said BETWEEN 1 and 100!");
		}
		else if(num == 2)
		{
			System.out.println("\nYour number is prime!\n");
		}
		else if((remain2 == 0) || (remain3 == 0) || (remain5 == 0)) 
		{
			System.out.println("\nYour number is not prime.\n");
		}
		else if(num == 1)
		{
			System.out.println("\nYour number is not prime!\n");
		}
		else
		{
			System.out.println("\nYour number is prime!\n");
		}
	}
}