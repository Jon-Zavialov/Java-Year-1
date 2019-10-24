public class Lowes
{
	public static void main(String[] args)
	{
		String name = "";
		int y = 0;
		char conf = ' ';
		double price = 0;
		int overFif = 0;
		int divThree = 0;
		double priceTot = 0;
		char cardConf = ' ';
		double tax = 0;
		
		System.out.print("Welcome to Lowes! What's your name?: ");
		name = SavitchIn.readLine();
		
		System.out.println("\nHello " + name + "!");
		
		do
		{
			y++;
			
			System.out.print("Please enter the price of item number " + y + " in a whole number: ");
			price = SavitchIn.readLineDouble();
			
			while(price < 0)
			{
				System.out.print("You can't have a negative price! Please try again, and input the price of item #" + y + ":");
				price = SavitchIn.readLineDouble();
			}
			
			if(price > 50)
			{
				overFif++;
			}
			
			if(price%3 == 0)
			{
				divThree++;
			}
			
			priceTot = priceTot + price;
			
			System.out.print("Do you have any more items? (Y/N): ");
			conf = SavitchIn.readLineNonwhiteChar();
		} while((conf == 'y') || (conf == 'Y'));
		
		System.out.println("\nOk! You purchased " + y + " items.");
		System.out.println(overFif + " of those items are over $50.");
		System.out.println(divThree + " of those items are divisible by 3.");
		System.out.println("Your total is $" + priceTot + ".");
		System.out.print("\n\n Do you have a Lowes credit card? (Y/N): ");
		cardConf = SavitchIn.readLineNonwhiteChar();
		
		if((cardConf == 'y') || (cardConf == 'Y'))
		{
			System.out.println("\nGreat! That means you get a 5% discount!");
			
			if(priceTot > 500)
			{
				priceTot = priceTot * .85;
				System.out.println("Since you also spent over $500, you get an additional 10% discount, making your total $" + (int)priceTot + "!");
			}
			else
			{
				priceTot = priceTot * .95;
				System.out.println("That makes your total $" + (int)priceTot + ".");
			}
		}
		else if(((cardConf == 'n') || (cardConf == 'N')) && (priceTot > 500))
		{
			priceTot = priceTot * .9;
			System.out.println("Ok! Since you spent over $500, you get a 10% discount, meaning your total is $" + (int)priceTot + "!");
		}
		else
		{
			System.out.println("Ok! your total is $" + (int)priceTot);
		}
		
		tax = (priceTot * .06) + .1;
		priceTot = priceTot + tax;
		
		System.out.println("That means your tax is $" + (int)tax + ", making your final price $" + (int)priceTot + ". Have a nice day!");
	}
}