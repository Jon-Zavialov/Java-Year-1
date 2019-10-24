import java.text.DecimalFormat;
  public class Kohls
{
	public static void main(String[] args)
	{
		char coup = ' ';
		double value = 0;
		double item1 = 0;
		double item2 = 0;
		double item3 = 0;
		double item4 = 0;
		double item5 = 0;
		double total = 0;
		String totalS = "";
		double disPer = 0;
		double dis = 0;
		double newTot = 0;
		String newTotS = "";
		double tax = 0;
		double finTot = 0;
		String fintTotS = "";
		double ship = 0;
		double kCash = 0;
		double kCashValue = 0;
		double math = 0;
		
		DecimalFormat round = new DecimalFormat("#.##");
		
		math = 10;
		
		System.out.println("                                                      _____");
		System.out.println("                                                     /     \\");
		System.out.println("                                                  __/       \\__");
		System.out.println("                                                 |__ _______ __|");
		System.out.println("                                                   /  _   _  \\");
		System.out.println("                                                   |  O   O  |   ____________________________________________");
		System.out.println("                                                   |         |  |Hi welcome to Kohls! Do you have a coupon? |");
		System.out.println("                                                   |   \\_/   | <____________________________________________|");
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
		System.out.println("                                                 |__/        \\__|");
		
		System.out.println("\na: Yes!");
		System.out.println("b: Nope!\n");
		coup = SavitchIn.readLineNonwhiteChar();
		
		if(coup == 'a')
		{
			System.out.println("\nGreat! Do you have a 15% coupon, a 20% coupon, or a 30% coupon? \nPlease enter the value of the coupon, with no percent sign.");
			value = SavitchIn.readLineDouble();
			
			if(value == 15)
			{
			}
			else if(value == 20)
			{
			}
			else if(value == 30)
			{
			}
			else
			{
				System.out.println("We don't have that coupon! Get out of here!\n");
				System.exit(2); //exits program if invalid coupon
			}
			
			System.out.println("\nOk! I see you have a Harry Potter book, a laundry hamper, a sofa, a spatula, and some tylenol.");
			System.out.println("Please list the totals of each of these items, and press enter after every entry.");
			item1 = SavitchIn.readLineDouble();
			item2 = SavitchIn.readLineDouble();
			item3 = SavitchIn.readLineDouble();
			item4 = SavitchIn.readLineDouble();
			item5 = SavitchIn.readLineDouble();
			
			total = item1 + item2 + item3 + item4 + item5;
			disPer = value / 100;
			dis = total * disPer;
			newTot = total - dis;
			tax = newTot * .06;
			kCash = newTot / 50;
			kCashValue = (((int)kCash) / math * 100);
			
			System.out.println("\nGreat! Your total is $" + totalS + ". \nBecause of your " + (int)value + "% off coupon, you are recieving $" + dis + " off your total.");
			
			if(newTot > 75)
			{
				finTot = tax + newTot;
				System.out.println("Because of this, your new total is $" + newTot + ". After the 6% sales tax, which adds $" + tax + " to your total, and no shipping cost, your final total is $" + finTot + ".");
				System.out.println("You spent $" + newTot + ", meaning you get $" + (int)kCashValue + " In Kohl's cash.");
			}
			else
			{
				ship = newTot * .12;
				finTot = tax + newTot + ship;
				System.out.println("Because of this, your new total is $" + newTot + ". After the 6% sales tax, which adds $" + tax + " to your total, and the shipping cost, which adds $" + ship + " to your total, your final total is $" + finTot + ".");
				System.out.println("You spent $" + newTot + ", meaning you get $" + (int)kCashValue + " In Kohl's cash.");
			}
		}
		else if(coup == 'b')
		{
			System.out.println("\nOk! I see you have a Harry Potter book, a laundry hamper, a sofa, a spatula, and some tylenol.");
			System.out.println("Please list the totals of each of these items, and press enter after every entry.");
			item1 = SavitchIn.readLineDouble();
			
			
			item2 = SavitchIn.readLineDouble();
			item3 = SavitchIn.readLineDouble();
			item4 = SavitchIn.readLineDouble();
			item5 = SavitchIn.readLineDouble();
			
			total = item1 + item2 + item3 + item4 + item5;
			tax = total * .06;
			kCash = total / 50;
			kCashValue = (((int)kCash) / math * 100);
			
			if(total > 75)
			{
				finTot = tax + total;
				System.out.println("Your total is $" + total + ". After the 6% sales tax, which adds $" + tax + " to your total, and no shipping cost, your final total is $" + finTot + ".");
				System.out.println("You spent $" + total + ", meaning you get $" + (int)kCashValue + " In Kohl's cash.");
			}
			else
			{
				ship = newTot * .12;
				finTot = tax + newTot + ship;
				System.out.println("Your total is $" + total + ". After the 6% sales tax, which adds $" + tax + " to your total, and the shipping cost, which adds $" + ship + " to your total, your final total is $" + finTot + ".");
				System.out.println("You spent $" + total + ", meaning you get $" + (int)kCashValue + " In Kohl's cash.");
			}
		}
		else
		{
			System.out.println("All you had to do was press a or b you moron!!!");
		}
	System.out.println("\nThank's for shopping at Kohl's. have a great day!\n\n");
	
	}	
}