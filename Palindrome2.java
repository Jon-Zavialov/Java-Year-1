public class Palindrome2
{
	public static void main(String[] args)
	{
		String word = "";
		char temp = ' ';
		String wordWithoutPunctAndSpaces = "";
		String backwordWithoutPunctAndSpaces = "";
		
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

			if((temp != ' ') && (temp != '.') && (temp != ',') && (temp != ':') && (temp != ';') && (temp != '"') && (temp != '\'') && (temp != '!') && (temp != '?'))
			{
				wordWithoutPunctAndSpaces = wordWithoutPunctAndSpaces + temp;
			}
		}
		
		for (int x = 0;	x < word.length();	x++)
		{
			temp = word.charAt(x);
			
			if((temp != ' ') && (temp != '.') && (temp != ',') && (temp != ':') && (temp != ';') && (temp != '"') && (temp != '\'') && (temp != '!') && (temp != '?'))
			{
				backwordWithoutPunctAndSpaces = backwordWithoutPunctAndSpaces + temp;
			}
		}
		
		System.out.println("Your word backwards is " + wordWithoutPunctAndSpaces);
		
		if(wordWithoutPunctAndSpaces.equalsIgnoreCase(backwordWithoutPunctAndSpaces))
		{
			System.out.println("Your word is a palindrome!\n");
		}	
		else
		{
			System.out.println("Your word is not a palindrome!\n");
		}
	}
}