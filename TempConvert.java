 public class TempConvert
{
	public static void main(String[] args)
	{
		String temp = "";
		int cLoc = 0;
		int fLoc = 0;
		int converted = 0;
		int tempInt = 0;
		String tempIntS = "";
		char measure = ' ';
		char conf = ' ';
		
		do
		{
		
			System.out.print("Welcome to the temperature converter! Please enter the temperature you would like to convert, \nfollowed by a C if it's celsius, or F if it's Fahrenheit: ");
			temp = SavitchIn.readLine();
			
			while ((temp.indexOf('C') == -1) && (temp.indexOf('c') == -1) && (temp.indexOf('F') == -1) && temp.indexOf('f') == -1)
			{
				System.out.print("Invalid! Please try again: ");
				temp = SavitchIn.readLine();
			}
		
			if ((temp.indexOf('C') == -1) && (temp.indexOf('c') == -1)) //Fahrenheit
			{
				if (temp.indexOf('F') == -1)
				{
					fLoc = temp.indexOf('f');
				}
				else
				{
					fLoc = temp.indexOf('F');
				}
			
				tempIntS = temp.substring(0,fLoc);
				tempInt = Integer.parseInt(tempIntS);
			
				converted = ((tempInt - 32) * 5) / 9;
				measure = 'C';
			}
			else														//Celsius
			{
				if (temp.indexOf('C') == -1)
				{
					cLoc = temp.indexOf('c');
				}
				else
				{
					cLoc = temp.indexOf('C');
				}
				
				tempIntS = temp.substring(0,cLoc);
				tempInt = Integer.parseInt(tempIntS);
				
				converted = ((tempInt/5) * 9) + 32;
				measure = 'F';
			}
		
			System.out.println("Great! " + temp + " is " + converted + measure + "!");
			System.out.print("Would you like to convert another temp? (Y if yes, any other key is no): ");
			conf = SavitchIn.readLineNonwhiteChar();
			System.out.println("");
		}while(conf == 'Y');
	}
}