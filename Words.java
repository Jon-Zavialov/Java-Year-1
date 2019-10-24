public class Words
{
	public static void main(String[] args)
	{
		String word = "";
		char firstLet = ' ';
		int length = 0;
		char conf = ' ';
		
		do
		{
			System.out.print("Please input a word that is at least 4 letters long: ");
			word = SavitchIn.readLine();
		
			length = word.length();
		
			while (length < 4)
			{
				System.out.print("\nInvalid! Please try again: ");
				word = SavitchIn.readLine();
			
				length = word.length();
			}
		
			word = word.toLowerCase();
			firstLet = word.charAt(0);
		
			if ((firstLet == 'a') || (firstLet == 'e') || (firstLet == 'i') || (firstLet == 'o') || (firstLet == 'u'))
			{
				System.out.println("\nBegins with a vowel");
			}
		
			if (word.equals("brian"))
			{
				System.out.println("Peppers");
			}
		
			System.out.println("Would you like to input another word? (Y/N)");
			conf = SavitchIn.readLineNonwhiteChar();
			
		} while ((conf == 'y') || (conf == 'Y'));
		
		System.out.println("\nOk! Goodbye! \n");
	}
}