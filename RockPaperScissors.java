public class RockPaperScissors
{
	public static void main(String[] args)
	{
		char choice = ' ';
		String choiceFull = "";
		String compChoiceFull = "";
		int compWins = 0;
		int useWins = 0;
		int bet = 0;
		int balance = 100;
		char conf = ' ';
		
		do
		{
		compWins = 0;
		useWins = 0;
		bet = 0;
		
		System.out.print("How much would you like to bet? You have " + balance + " dollars: $");
		bet = SavitchIn.readLineInt();
		
		while (bet > balance)
		{
			System.out.print("You don't have that much money! Try again: ");
			bet = SavitchIn.readLineInt();
		}
		
		while((compWins != 5) && (useWins != 5))
		{
		System.out.print("Let's play rock paper scissors! First to 5 wins wins the game.\nPick your choice! I won't know. (R = Rock, P = Paper, S = Scissors): ");
		choice = SavitchIn.readLineNonwhiteChar();
		
		while((choice != 'R') && (choice != 'P') && (choice != 'S'))
		{
			System.out.print("Not a valid choice! Try again: ");
			choice = SavitchIn.readLineNonwhiteChar();
		}
		
		System.out.println("Alright! Let's play!");
		
		if(choice == 'R')
		{
			choiceFull = "Rock";
		}
		else if (choice == 'P')
		{
			choiceFull = "Paper";
		}
		else
		{
			choiceFull = "Scissors";
		}
		
		int compChoice = (int)(Math.random()*3+1);
		if (compChoice == 1)
		{
			compChoiceFull = "Rock";
		}
		else if (compChoice == 2)
		{
			compChoiceFull = "Paper";
		}
		else
		{
			compChoiceFull = "Scissors";
		}
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Rock!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Paper!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Scissors!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Your choice: " + choiceFull + ".");
		System.out.println("My choice: " + compChoiceFull + ".");
		
		while(compChoiceFull.equalsIgnoreCase(choiceFull)) //loop if tied
		{
			System.out.print("We tied! Let's try again: ");
			choice = SavitchIn.readLineNonwhiteChar();
		
		while((choice != 'R') && (choice != 'P') && (choice != 'S'))
		{
			System.out.print("Not a valid choice! Try again: ");
			choice = SavitchIn.readLineNonwhiteChar();
		}
		
		System.out.println("Alright! Let's play!");
		
		if(choice == 'R')
		{
			choiceFull = "Rock";
		}
		else if (choice == 'P')
		{
			choiceFull = "Paper";
		}
		else
		{
			choiceFull = "Scissors";
		}
		
		compChoice = (int)(Math.random()*3+1);
		if (compChoice == 1)
		{
			compChoiceFull = "Rock";
		}
		else if (compChoice == 2)
		{
			compChoiceFull = "Paper";
		}
		else
		{
			compChoiceFull = "Scissors";
		}
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Rock!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Paper!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Scissors!");
		
		try{
		Thread.sleep(500);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("Your choice: " + choiceFull + ".");
		System.out.println("My choice: " + compChoiceFull + ".");
		}                                                             //end of loop if tied
		if (((choice == 'R') || (compChoice == 1)) && ((choice == 'S') || (compChoice == 3)))
		{
			if (choice == 'R')
			{
				System.out.println("You win!");
				useWins++;
			}
			else
			{
				System.out.println("I win!");
				compWins++;
			}
		}
		else if (((choice == 'S') || (compChoice == 3)) && ((choice == 'P') || (compChoice == 2)))
		{
			if (choice == 'S')
			{
				System.out.println("You win!");
				useWins++;
			}
			else
			{
				System.out.println("I win!");
				compWins++;
			}
		}
		else if (((choice == 'P') || (compChoice == 2)) && ((choice == 'R') || (compChoice == 1)))
		{
			if (choice == 'P')
			{
				System.out.println("You win!");
				useWins++;
			}
			else
			{
				System.out.println("I win!");
				compWins++;
			}
		}
		
		System.out.println("I've won " + compWins + " times, You've won " + useWins + " times. \n");
		}
		

		balance = balance - bet;
		if(compWins > useWins)
		{
		}
		else 
		{
			balance = balance + (3 * bet);
		}
		System.out.print("Play again? Your balance is " + balance + "(Yes = Y): ");
		conf = SavitchIn.readLineNonwhiteChar();
		}while(conf == 'Y');
		
		
	}
}