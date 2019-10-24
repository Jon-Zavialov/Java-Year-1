public class Quiz3Review
{
	public static void main(String[] args)
	{
		String word = "";
		int beg = 0;
		int end = 0;
		
		System.out.print("Please enter a word that is at least 5 letters long, but no longer than 10!: ");
		word = SavitchIn.readLine();
		
		while ((word.length() < 5) || (word.length() > 11))
		{
			System.out.print("Invalid input! Please try again: ");
			word = SavitchIn.readLine();
		}
		
		if ((word.charAt(3) == 'a') || (word.charAt(3) == 'e') || (word.charAt(3) == 'i') || (word.charAt(3) == 'o') || (word.charAt(3) == 'u'))
		{
			System.out.println("\nThe fourth letter of your word is the vowel " + word.charAt(3) + ".");
		}
		
		System.out.print("\nPlease enter an even begginging number: ");
		beg = SavitchIn.readLineInt();
		
		while (beg%2 != 0)
		{
			System.out.print("That's not even! Please try again: ");
			beg = SavitchIn.readLineInt();
		}
		
		System.out.print("\nPlease enter an odd ending number: ");
		end = SavitchIn.readLineInt();
		
		while (end%2 == 0)
		{
			System.out.print("That's not odd! Please try again: ");
			end = SavitchIn.readLineInt();
		}
		
		if(beg < end)
		{
			while (x //right here)
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
	}
}