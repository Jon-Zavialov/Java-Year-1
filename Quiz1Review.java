  public class Quiz1Review
{
	public static void main(String[] args)
	{
		String name = "";
		char ready = ' ';
		char multiChoice = ' ';
		
		System.out.println("Hi! What's your name?");
		name = SavitchIn.readLine();
		
		System.out.println("\nWelcome " + name + ", are you ready for the quiz tommorow? \nY or N");
		ready = SavitchIn.readLineNonwhiteChar();
		
		if(ready == 'Y')
		{
			System.out.println("Great! Good luck then!\n");
		}
		else if(ready == 'N')
		{
			System.out.println("\nOk, let me help you!\nWhat do you find the hardest?");
			System.out.println("	a: Variables");
			System.out.println("	b: if statements");
			System.out.println("	c: computer syntax");
			multiChoice = SavitchIn.readLineNonwhiteChar();
			
			if(multiChoice == 'a')
			{
				System.out.println("\nVariables are easy! \nIf it's a single number, then declare it by using \nint = 0;\nThen, give it a user inputted value or a value or your own.\nIf it's a number with a decimal, do the same thing but replace int with double.\nIf it's a single charachter, then type\nchar = ' ';\n then, have the user input a value or set one of your own.\nLastly, if it's multiple words, type\nString = ''; , but replace the single quotes with double quotes.\nThen, have the user set a value or input your own.\n");
			}
			else if(multiChoice == 'b')
			{
				System.out.println("\nIf statements are easy! Just type\nIf(statement)\n{\n     code\n}\nIf that's the only statement, finsih it with\nelse\n{\n     code\n}\nif you have more statements, type\nelse if(statement)\n{\n     code\n}\nThen, follow it with your else statement.\n");
			}
			else if(multiChoice == 'c')
			{
				System.out.println("\nThat's easy! \na ; goes after variable declarations and system prints");
			}
			else //error checking
			{
			System.out.println("You had one job!!!");
			}
			
			System.out.println("And that's all you have to do! Good luck with the quiz!");
		}
		else //error checking
		{
			System.out.println("You had one job!!!");
		}
	}
}