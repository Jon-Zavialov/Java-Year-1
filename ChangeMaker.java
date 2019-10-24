public class ChangeMaker
{
	public static void main(String[] args)
	{
		double amount = 0;
		double math = 0;
		double quarters = 0;
		int quarterCents = 0;
		double dimes = 0;
		double dimesCents = 0;
		double nickles = 0;
		double nicklesCents = 0;
		double pennies = 0;
		
		String pluralQuart = "";
		String pluralDime = "";
		String pluralNick = "";
		String pluralPenn = "";
		
		System.out.println("Hello user! Please input the dollar amount you want change in, as a number with a decimal, and no dollar sign.");
		
		amount = SavitchIn.readLineDouble(); 
		
		math = (amount * 100);
		
		quarters = (math / 25);
		quarterCents = ((int)quarters * 25);
		
		if((int)quarters==1)
		{
			pluralQuart = "quarter";
		}
		else
		{
			pluralQuart = "quarters";
		}
		
		dimes = ((math - quarterCents) / 10);
		dimesCents = ((int)dimes * 10);
		
		if((int)dimes==1)
		{
			pluralDime = "dime";
		}
		else
		{
			pluralDime = "dimes";
		}
		
		nickles = ((math - quarterCents - dimesCents) / 5);
		nicklesCents = ((int)nickles * 5);
		
		if((int)nickles==1)
		{
			pluralNick = "nickle";
		}
		else
		{
			pluralNick = "nickles";
		}
		
		pennies = ((math - quarterCents - dimesCents - nicklesCents));
		
		if((int)pennies==1)
		{
			pluralPenn = "cent";
		}
		else
		{
			pluralPenn = "cents";
		}
		
		System.out.println("\nYou need " + (int)quarters + " " + pluralQuart + ", " + (int)dimes + " " + pluralDime + ", " + (int)nickles + " " + pluralNick + ", and " + (int)pennies + " " + pluralPenn + ".\n");
		
		}
	}