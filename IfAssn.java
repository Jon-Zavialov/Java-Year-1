public class IfAssn
{
	public static void main(String[] args)
	{
		String name = "";
		int year = 0;
		char show = ' ';
		char famChar = ' ';
		char southChar = ' ';
		char choice = ' ';
		
		System.out.println("Hi! What's your name?");
		
		name = SavitchIn.readLine();
		
		if(name.equalsIgnoreCase("Jon"))
		{
			System.out.println("\nMy name's also Jon!\n");
		}
		else
		{
			System.out.println("\nHi, " + name + "!\n");
		}
		
		System.out.println("What year were you born?");
		
		year = SavitchIn.readLineInt();
		
		if(year==2001)
		{
			System.out.println("\nYou turn 18 this year!");
		}
		else if(year > 2001)
		{
			System.out.println("\nYou can't vote :(");
		}
		else if(year < 1890)	
		{
			System.out.println("\nInvalid answer, dead people can't use computers!");
		}	
		else
		{
			System.out.println("\nYou can vote!");
		}		
		
		System.out.println("\nWhich show do you like more?");
		System.out.println("	a: Family Guy");
		System.out.println("	b: South Park");
		
		show = SavitchIn.readLineNonwhiteChar();
		
		if(show == 'a')
		{
			System.out.println("\nNice! What's your favorite charachter in Family Guy?");
			System.out.println("	a: Stewie");
			System.out.println("	b: Peter");
			System.out.println("	c: Brian");
			
			famChar = SavitchIn.readLineNonwhiteChar();
			
			if(famChar == 'a')
			{
				System.out.println("\nGood choice, but I like Brian.\n");
			}
			else if(famChar == 'b')
			{
				System.out.println("\nGood choice, but I like Brian.\n");
			}
			else if(famChar == 'c')
			{
				System.out.println("\nThat's my favorite character too!\n");
			}
			else //error checking
			{
				System.out.println("\nYou had one job, and you failed.");
			}
			
		}
		else if(show == 'b')
		{
			System.out.println("\nNice! What's your favorite charachter in South Park?");
			System.out.println("	a: Eric");
			System.out.println("	b: Kyle");
			System.out.println("	c: Kenny");
			
			southChar = SavitchIn.readLineNonwhiteChar();
			
			if(southChar == 'a')
			{
				System.out.println("\nGood choice, but I like Kenny.\n");
			}
			else if(southChar == 'b')
			{
				System.out.println("\nGood choice, but I like Kenny.\n");
			}
			else if(southChar == 'c')
			{
				System.out.println("\nThat's my favorite character too!\n");
			}
			else //error checking
			{
				System.out.println("\nYou had one job, and you failed.");
			}
		}
		else //error checking
		{
			System.out.println("\nYou had one job, and you failed.");	
		}
		
		System.out.println("Emetophobia is the fear of?");
		System.out.println("	a: vommiting");
		System.out.println("	b: flying");
		System.out.println("	c: spiders");
		System.out.println("	d: being lonely");
		
		choice = SavitchIn.readLineNonwhiteChar();
		
		if(choice == 'a')
		{
			System.out.println("\nCorrect! Nice job!\n");
		}
		else if (choice == 'b')
		{
			System.out.println("\nWrong! Goodbye!\n");
		}
		else if (choice == 'c')
		{
			System.out.println("\nWrong! Goodbye!\n");
		}
		else if (choice == 'd')
		{
			System.out.println("\nWrong! Goodbye!\n");
		}
		else //error checking
		{
			System.out.println("\nYou had one job, and you failed.");
		}
	}
}