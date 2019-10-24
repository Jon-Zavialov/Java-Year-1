public class Palindrome1
{
	public static void main(String[] args)
	{
		String word = "";
		String backWord = "";
		char temp = ' ';
		
		System.out.print("Please enter a word at least 5 characters long: ");
		word = SavitchIn.readLine();
		
		while (word.length() < 5)
		{
			System.out.print("That is less than 5 characters! Try again: ");
			word = SavitchIn.readLine();
		}
		
		for (int x = (word.length() - 1);	x >= 0;		x--)
		{
			temp = word.charAt(x);
			backWord = backWord + temp;
		}
		
		System.out.println("Your word backwards is " + backWord);
		
		if(backWord.equalsIgnoreCase(word))
		{
			System.out.println("Your word is a palindrome!\n");
		}	
		else
		{
			System.out.println("Your word is not a palindrome!\n");
		}
	}
}