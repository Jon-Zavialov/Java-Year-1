public class Fruit
{
	public static void main(String[] args)
	{
		int num = 0;
		
		System.out.println("Please enter a number!");
		num = SavitchIn.readLineInt();
		
		if((num % 2 == 0) && (num > 17))
		{
			System.out.println("\nRhubarb\n");
		}
		else if((num % 2 == 1) || (num < 10))
		{
			System.out.println("\nBanana\n");
		}
		else
		{
			System.out.println("\nGreat!\n");
		}
	}
}