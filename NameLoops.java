public class NameLoops
{
	public static void main(String[] args)
	{
		
		String name = "";
		int length = 0;
		int space = 0;
		int y = 0;
		char x = ' ';
		String lower = "";
		char v = ' ';
		int vowels = 0;
		int cons = 0;
		int ks = 0;
		
		System.out.print("Please input your first and last name: ");
		name = SavitchIn.readLine();	
		
		space = name.indexOf(' ');
		length = name.length();			
		lower = name.toLowerCase();
		
		while((space == -1) || (length <= 5))
		{
			System.out.print("Invalid! It must be more than 5 characters, and have your first and last name.\nTry again: ");
			name = SavitchIn.readLine();
			
			space = name.indexOf(' ');
			length = name.length();
			lower = name.toLowerCase();
		}
		
		System.out.println("\n");
		
		length = lower.length();
	
		while(y < length)
		{
			x = name.charAt(y);
			v = lower.charAt(y);
			
			System.out.println(x);
			
			y++;
			
			if((v == 'a') || (v == 'e') || (v == 'i') || (v == 'o') || (v == 'u'))
			{
				vowels++;
			}
			else if (v == ' ')
			{
			}
			else
			{
				cons++;
			}
			
			if(v == 'k')
			{
				ks++;
			}
		}
		
	System.out.println("\nThere were " + vowels + " vowels in your name, " + cons + " consonants in your name, and " + ks + " k's in your name.");
			
	if(vowels%2 == 0)
	{
		System.out.println(vowels + " is even.");
	}
	else
	{
		System.out.println(vowels + " is odd.");
	}
	
	if(cons%2 == 0)
	{
		System.out.println(cons + " is even.");
	}
	else
	{
		System.out.println(cons + " is odd.");
	}
	
	if(ks%2 == 0)
	{
		System.out.println(ks + " is even.\n");
	}
	else
	{
		System.out.println(ks + " is odd.\n");
	}
	
	}
}