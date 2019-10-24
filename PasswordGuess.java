public class PasswordGuess
{
	public static void main(String[] args)
	{
		String password = "";
		String guess = "";
		int guessNum = 0;
		int x = 0;
		int ex = ' ';
		int at = ' ';
		int hash = ' ';
		int dol = ' ';
		int perc = ' ';
		int length = 0;
		int y = 0;
		char car = ' ';
		int numNum = 0;
		
		password = "JonIsC00l!";

		do
		{
			System.out.println("Guess my password!");
			guess = SavitchIn.readLine();
			
			x++;
			
			ex = guess.indexOf('!');
			at = guess.indexOf('@');
			hash = guess.indexOf('#');
			dol = guess.indexOf('$');
			perc = guess.indexOf('%');
			
			length = guess.length();
			
			y = 0;
			
			while(y < length)
			{
				car = guess.charAt(y);
				
				if ((car == '1') || (car == '2') || (car == '3') || (car == '4') || (car == '5') || (car == '6') || (car == '7') || (car == '8') || (car == '9') || (car == '0'))
				{
					numNum++;
				}
				else
				{
				}
				
				y= y + 1;
	
			}
			
			if (guess.equals("JonIsC00l!"))
			{
				break;
			}
			else
			{
				System.out.println("Wrong!"); 
				
				if((length > 12) || (length < 8))
				{
					System.out.println("It needs to be between 8 and 12 characters!");
					numNum = 0;
				}
				else if ((ex == -1) && (at == -1) && (hash == -1) && (dol == -1) && (perc == -1))
				{
					System.out.println("It has to contain special characters! (!,@,#,$,%)");
					numNum = 0;
				}
				else if (numNum < 2)
				{
					System.out.println("It has to conatin two numbers!");
					numNum = 0;
				}
				else
				{
					System.out.println("Your password meets all the criteria, but it's wrong!");
					numNum = 0;
				}
			}
		
		} while (x>-1);
				
		if(x < 5)
		{
			System.out.println("Good job! You guessed it in less than 5 guesses!!");
		}
		else
		{
			System.out.println("You're stupid! That took you " + x + " guesses!");
		}
	} 
}