public class For2
{
	public static void main(String[] args)
	{
		int start = 0;
		int end = 0;
		int x = 0;
		int sum = 0;
		
		System.out.print("Which number should I start at? ");
		start = SavitchIn.readLineInt();
		
		System.out.print("Which number should I end at? ");
		end = SavitchIn.readLineInt();
		
		if(start < end)
		{
			for(x = start;	x <= end;	x++)
			{
				System.out.println(x);
				sum = sum + x;
			}
		}
		else if(end < start)
		{
			for(x = start;	x >= end;	x--)
			{
				System.out.println(x);
				sum = sum + x;
			}
		}
		else
		{
			System.out.println(start);
			sum = sum + start;
		}
		
		System.out.println("\nSum = " + sum + ".");
	}
}