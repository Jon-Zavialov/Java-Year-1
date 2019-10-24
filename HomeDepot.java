  public class HomeDepot
{
	public static void main(String[] args)
	{
		String name = "";
		double fridgePrice = 0;
		double microPrice = 0;
		double dishPrice = 0;
		double stovePrice = 0;
		double total = 0;
		char mem = ' ';
		double newTot = 0;
		double finTot = 0;
		int guess = 0;
		double disAm = 0;
		
		System.out.println("                                                      _____");
		System.out.println("                                                     /     \\");
		System.out.println("                                                  __/       \\__");
		System.out.println("                                                 |__ _______ __|");
		System.out.println("                                                   /  _   _  \\");
		System.out.println("                                                   |  O   O  |   _______________________");
		System.out.println("                                                   |         |  | Hi! What's your name? |");
		System.out.println("                                                   |   \\_/   | <________________________|");
		System.out.println("                                                   \\_________/");
		System.out.println("                                                   __   ||   __");
		System.out.println("                                                  \\_ \\__||__/ _/");
		System.out.println("                                                    \\___||___/ ");
		System.out.println("                                                        ||");
		System.out.println("                                                        ||");
		System.out.println("                                                        ||");
		System.out.println("                                                       //\\\\");
		System.out.println("                                                      //  \\\\");
		System.out.println("                                                     //    \\\\");
		System.out.println("                                                  __//      \\\\__");
		System.out.println("                                                 |__/        \\__|\n\n\n");
		
		System.out.println("Type your name here:");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi " + name + "! \nI see you have a refridgerator. What's the price?");
		fridgePrice = SavitchIn.readLineDouble();
		
		System.out.println("\nGreat! How much is that microwave?");
		microPrice = SavitchIn.readLineDouble();
		
		System.out.println("\nOk! What about that dishwasher?");
		dishPrice = SavitchIn.readLineDouble();
		
		System.out.println("\nAwesome. How much is the stove?");
		stovePrice = SavitchIn.readLineDouble();
		
		total = fridgePrice + microPrice + dishPrice + stovePrice;
		
		if(total <= 0)
		{
			System.out.println("\nInvalid price!\n");
			System.exit(2); //error checking
		}
		else
		{
		}
		
		System.out.println("\nGot it. Your total is $" + (int)total + ". Are you a Platinum Shopping Member?\nY = yes	N = No.");
		mem = SavitchIn.readLineNonwhiteChar();
		
		if(mem == 'Y')
		{
			if(total >= 3500)
			{
				newTot = total * .7;
				finTot = newTot * 1.06;
				
				System.out.println("\nGreat! Since your total is $" + total + ", you get a 30% discount!");
				System.out.println("This makes your new total $" + newTot);
				System.out.println("With the 6% sales tax, your final total is $" + finTot + "\n");
			}
			else if(total >= 2000)
			{
				newTot = total * .8;
				finTot = newTot * 1.06;
				
				System.out.println("\nGreat! Since your total is $" + total + ", you get a 20% discount!");
				System.out.println("This makes your new total $" + newTot);
				System.out.println("With the 6% sales tax, your final total is $" + finTot + "\n");
			}
			else if(total >= 1000)
			{
				newTot = total * .9;
				finTot = newTot * 1.06;
				
				System.out.println("\nGreat! Since your total is $" + total + ", you get a 10% discount!");
				System.out.println("This makes your new total $" + newTot);
				System.out.println("With the 6% sales tax, your final total is $" + finTot + "\n");
			}
			else
			{
				finTot = total * 1.06;
				
				System.out.println("\nGreat! Unfortunatley, since you spent less than $1000, there is no discount.");
				System.out.println("With the 6% sales tax, your final total is $" + finTot + "\n");
			}
		}
		else if(mem == 'N')
		{
			System.out.println("\nOk! Today we are having a special promotion! You have a 1 in 5 chance of getting a 25% discount, \nif you can guess one of the two numbers between 1 and 10 that i am thinking of.");
			guess = SavitchIn.readLineInt();
			
			if((guess > 10) || (guess < 1))
			{
				System.out.println("\nAll you had to do was type in a number between one and ten ya moron!");
			}
			else if((guess == 2) || (guess == 8))
			{
				disAm = total * .25;
				newTot = total - disAm;
				finTot = newTot * 1.06;
				
				System.out.println("\nCongradulations!!! You guessed one of the correct numbers and one the 25% discount!");
				System.out.println("Your original total was $" + total + " after the discount of $" + disAm + ", your new total is $" + newTot + "\nWith the 6% sales tax, your final total is $" + finTot + "\n");
			}
			else
			{
				finTot = total * 1.06;
				
				System.out.println("Sorry, you did not guess a correct number. Your total is $" + total + "\nWith the 6% sales tax, your final total is $" + finTot + "\n");
			}

		}
		else
		{
			System.out.println("\nAll you had to do was type yes or no!!!");
			System.exit(2); //exits program if invalid answer
		}
	}
}