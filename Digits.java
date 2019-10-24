public class Digits
{
	public static void main(String[] args)
	{
		int num = 0;
		int ans = 0;
		int minAns = 0;

		System.out.println("Please enter a three digit number.");
		num = SavitchIn.readLineInt();
		
		if((num / 100) >= 10)
		{
			System.out.println("\nThe prompt said THREE digits ya moron!!!\n");
		}
		else if((num / 100) >= 1)
		{
			ans = num / 100;
			minAns = num%100;
			
			System.out.println("\n" + ans);
			
			ans = minAns / 10;
			minAns = minAns%10;
		
			System.out.println(ans);
			System.out.println(minAns + "\n");
		}
		else
		{
			System.out.println("\nThe prompt said THREE digits ya moron!!!\n");
		}
	}
}