public class Koko
{
	public static void main(String[] args)
	{
		String name = "";
		String lower = "";
		int ts = 0;
		int vowels = 0;
		int cons = -1;
		String divFour = "";
		int space = 0;
		char lastLet = ' ';
		
		System.out.print("What's your favorite teacher's first and last name? (Must be at least 6 characters long): ");
		name = SavitchIn.readLine();
		
		while(name.length() < 6)
		{
			System.out.print("Invalid! Please try again: ");
			name = SavitchIn.readLine();
		}
		
		if(name.equalsIgnoreCase("koko lampino"))
		{
			System.out.println("\nYou're dumb!");
		}
		
		lower = name.toLowerCase();
	
		System.out.println("\n");
		
		for(int k = 0;	k < name.length();	k++)
		{
			System.out.println("Letter #" + (k+1) + ": " + name.charAt(k));
			
			if(lower.charAt(k) == 't')
			{
				ts++;
			}
			
			if((lower.charAt(k) == 'a') || (lower.charAt(k) == 'e') || (lower.charAt(k) == 'i') || (lower.charAt(k) == 'o') || (lower.charAt(k) == 'u'))
			{
				vowels++;
			}
			else
			{
				cons++;
			}
		}
		
		System.out.println("\nThere were " + ts + " t's in the name.");
		System.out.println("There were " + vowels + " vowels the name.");
		System.out.println("There were " + cons + " consonants the name.");
		
		if(cons%4 == 0)
		{
			divFour = " is";
		}
		else
		{
			divFour = " is not";
		}
		
		System.out.println(cons + divFour + " divisible by four.");
		
		space = name.indexOf(' ');
		
		lastLet = name.charAt(space-1);
		
		System.out.println("\n" + lastLet + name.charAt(name.length()-1) + "\n");
	}
}