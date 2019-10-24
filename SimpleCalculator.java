public class SimpleCalculator
{
	public static void main(String[] args)
	{
		String firstName = " ";
		char midInit = ' ';        //Entering the name for the first part
		String lastName = " ";
		
		double num1 = 0;
		int num2 = 0;             //Entering the numbers and answers for the second part
		double sum = 0;
		double dif = 0;
		double prod = 0;
		double div = 0;
		
		
		System.out.println("\nHello user! Please type in your first name and click enter.");
		
			firstName = SavitchIn.readLine();
			
		System.out.println("\nThank's " + firstName + "! What's your middle initial?");
		
			midInit = SavitchIn.readLineNonwhiteChar();
			
		System.out.println("\nGreat! Now, what's you last name?");
		
			lastName = SavitchIn.readLine();
			
		System.out.println("\nHello, " + firstName + " " + midInit + ". " + lastName + "!\nPlease input one number of your choice, press enter, \nand input a second number of your choice, also pressing enter afterwards.");
			
			num1 = SavitchIn.readLineDouble();
			num2 = SavitchIn.readLineInt();
			
			sum = (num1 + num2);
			dif = (num1 - num2);
			prod = (num1 * num2);
			div = (num1 / num2);
		
		System.out.println("\n\nYou inputed the numbers " + (int)num1 + " and " + num2 + ".\n" + (int)num1 + " + " + num2 + " = " + (int)sum + ".");
		System.out.println( (int)num1 + " - " + num2 + " = " + (int)dif );
		System.out.println( (int)num1 + " X " + num2 + " = " + (int)prod );
		System.out.println( (int)num1 + " / " + num2 + " = " + div + "	\n" );
		
	}		
}	