public class SlotMachine
{
	public static void main(String[] args)
	{
		int balance = 100;
		int bet = 0;
		String fill = "";
		char conf = ' ';
		
		do
		{
		System.out.print("How much would you like to bet? You have " + balance + " dollars: $");
		bet = SavitchIn.readLineInt();
		
		while(bet > balance)
		{
			System.out.print("You can't bet more money than you have! Try again: $");
			bet = SavitchIn.readLineInt();
		}
		
		balance = balance - bet;
		
		System.out.print("Great! Let's play! Press enter when you're ready to pull the lever.");
		fill = SavitchIn.readLine();
		
		int slot1 = (int)(Math.random()*9+1);
		int slot2 = (int)(Math.random()*9+1);
		int slot3 = (int)(Math.random()*9+1);
		
		System.out.print(slot1 + " ");
		
		try{
		Thread.sleep(1500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(slot2 + " ");
		
		try{
		Thread.sleep(1500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(slot3 + " ");
		
		if((slot1 == 7) && (slot2 == 7) && (slot3 == 7))
		{
			System.out.println("\nYou got a lucky 7! That means you get 1000X your bet.");
			balance = balance + (1000 * bet);
		}
		else if((slot1 == slot2) || (slot2 == slot3) || (slot1 == slot3)) 
		{
			System.out.println("\nTwo of your numbers were matching! That means you get 4X your bet.");
			balance = balance + (4 * bet);
		}
		else if((slot1 == slot2) && (slot2 == slot3))
		{
			System.out.println("\nAll of your numbers were matching! That means you get 100X your bet.");
			balance = balance + (100 * bet);
		}
		else
		{
			System.out.println("\nSorry! None of the numbers were matching.");
		}
		
		System.out.println("Your balance is $" + balance + " Play again? (Y/N): ");
		conf = SavitchIn.readLineNonwhiteChar();
		}while(conf == 'Y');
	}
}