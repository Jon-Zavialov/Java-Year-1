public class Division
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		int ans = 0;
		double num3 = 0;
		double ans1 = 0;
		double ans2 = 0;
		
		System.out.println("Please enter two numbers.");
		num1 = SavitchIn.readLineInt();
		num2 = SavitchIn.readLineInt();
		
		ans = num1%num2;
		
		System.out.println("\nWhen your two numbers are divided, the remainder is " + ans + ".");
		
		if(ans == 0)
		{
			System.out.println("That means they're divisble!\n");
		}
		else
		{
			System.out.println("This means that they're not divisible.\n");
		}
		
		System.out.println("Please enter a third number.");
		num3 = SavitchIn.readLineDouble();
		
		ans1 = num3 / 100;
		ans2 = num3 / 10;
		
		System.out.println("\n" + (int)num3 + " / 100 = " + ans1);
		System.out.println((int)num3 + " / 10 = " + ans2 + "\n");
	}
}