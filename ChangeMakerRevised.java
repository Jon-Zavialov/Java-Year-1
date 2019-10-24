public class ChangeMakerRevised
{
	public static void main(String[] args)
	{ 
		double pennies = 0; 
		double amount = 0; 
		System.out.println("Hello! Please enter an amount."); 
		amount = SavitchIn.readLineDouble();
		pennies = ((amount-((amount-(amount%.25))+((amount%.25)-((amount%.25)%.10))+(((amount%.25)%.10)-((((amount%.25)%.10)%.05)))))*100)+.1;
		System.out.println("\nYou need " + (amount-(amount%.25))/.25 + " quarters, " + ((amount%.25)-((amount%.25)%.10))/.10 + " dimes, " + ((((amount%.25)%.10)-((((amount%.25)%.10)%.05)))/.05) + " nickles, and " + (int)pennies + ".0 pennies.\n");
	}
}