public class ChangeMakerRevisedRevised
{
	public static void main(String[] args)
	{
		String quarters = ""; String dimes = ""; String nickels = ""; String penny = ""; double pennies = 0; double amount = 0; System.out.println("Hello! Please enter an amount."); amount = SavitchIn.readLineDouble();pennies = ((amount-((amount-(amount%.25))+((amount%.25)-((amount%.25)%.10))+(((amount%.25)%.10)-((((amount%.25)%.10)%.05)))))*100)+.1;if((amount-(amount%.25))/.25 == 1) {quarters = "quarter";}
		else {quarters = "quarters";}
		if(((amount%.25)-((amount%.25)%.10))/.10 == 1) { dimes = "dime"; }
		else { dimes = "dimes"; }
		if ((((((amount%.25)%.10)-((((amount%.25)%.10)%.05)))/.05)) == 1) {nickels = "nickle";}
		else {nickels = "nickles";}
		if((int)pennies == 1) { penny = "penny";}
		else { penny = "pennies";} System.out.println("\nYou need " + (amount-(amount%.25))/.25 + " " + quarters + ", " + ((amount%.25)-((amount%.25)%.10))/.10 + " " + dimes + ", " + ((((amount%.25)%.10)-((((amount%.25)%.10)%.05)))/.05) + " " + nickels + ", and " + (int)pennies + ".0 " + penny + ".\n");
	}
}