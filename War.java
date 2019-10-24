public class War
{
	public static void main(String[] args)
	{
		int balance = 100;
		int bet = 0;
		String useStringCard = "";
		String compStringCard = "";
		String temp = "";
		int useScore = 26;
		int compScore = 26;
		char conf = ' ';
		int warCount = 0;
		
		do{
		useScore = 26;
		compScore = 26;	
	
		System.out.print("How much would you like to bet? You have " + balance + " dollars: $");
		bet = SavitchIn.readLineInt();
		
		while(bet > balance)
		{
			System.out.print("You can't bet more money than you have! Try again: $");
			bet = SavitchIn.readLineInt();
		}
		
		balance = balance - bet;
		
		do{
		warCount = 0;
		System.out.println("Alright! Let's play!");
		
		int useCard = (int)(Math.random()*13+2);
		int compCard = (int)(Math.random()*13+2);
		
		if(useCard == 2)
		{
			useStringCard = "2";
		}
		else if(useCard == 3)
		{
			useStringCard = "3";
		}
		else if(useCard == 4)
		{
			useStringCard = "4";
		}
		else if(useCard == 5)
		{
			useStringCard = "5";
		}
		else if(useCard == 6)
		{
			useStringCard = "6";
		}
		else if(useCard == 7)
		{
			useStringCard = "7";
		}
		else if(useCard == 8)
		{
			useStringCard = "8";
		}
		else if(useCard == 9)
		{
			useStringCard = "9";
		}
		else if(useCard == 10)
		{
			useStringCard = "10";
		}
		else if(useCard == 11)
		{
			useStringCard = "Jack";
		}
		else if(useCard == 12)
		{
			useStringCard = "Queen";
		}
		else if(useCard == 13)
		{
			useStringCard = "King";
		}
		else
		{
			useStringCard = "Ace";
		}
		
		if(compCard == 2)
		{
			compStringCard = "2";
		}
		else if(compCard == 3)
		{
			compStringCard = "3";
		}
		else if(compCard == 4)
		{
			compStringCard = "4";
		}
		else if(compCard == 5)
		{
			compStringCard = "5";
		}
		else if(compCard == 6)
		{
			compStringCard = "6";
		}
		else if(compCard == 7)
		{
			compStringCard = "7";
		}
		else if(compCard == 8)
		{
			compStringCard = "8";
		}
		else if(compCard == 9)
		{
			compStringCard = "9";
		}
		else if(compCard == 10)
		{
			compStringCard = "10";
		}
		else if(compCard == 11)
		{
			compStringCard = "Jack";
		}
		else if(compCard == 12)
		{
			compStringCard = "Queen";
		}
		else if(compCard == 13)
		{
			compStringCard = "King";
		}
		else
		{
			compStringCard = "Ace";
		}

		if(compCard > useCard)
		{
			System.out.println("I win!");
			compScore++;
			useScore--;
		}
		else if(compCard < useCard)
		{
			System.out.println("You win!");
			useScore++;
			compScore--;
		}
		
		while((compCard == useCard) && (useScore >= 5) && (useScore >= 5))
		{
		
			System.out.println("My card: " + compStringCard);
			System.out.println("Your card: " + useStringCard);
			
			System.out.println("We tied! This means war!");
			
			warCount++;
			
		useCard = (int)(Math.random()*13+2);
		compCard = (int)(Math.random()*13+2);
		
		if(useCard == 2)
		{
			useStringCard = "2";
		}
		else if(useCard == 3)
		{
			useStringCard = "3";
		}
		else if(useCard == 4)
		{
			useStringCard = "4";
		}
		else if(useCard == 5)
		{
			useStringCard = "5";
		}
		else if(useCard == 6)
		{
			useStringCard = "6";
		}
		else if(useCard == 7)
		{
			useStringCard = "7";
		}
		else if(useCard == 8)
		{
			useStringCard = "8";
		}
		else if(useCard == 9)
		{
			useStringCard = "9";
		}
		else if(useCard == 10)
		{
			useStringCard = "10";
		}
		else if(useCard == 11)
		{
			useStringCard = "Jack";
		}
		else if(useCard == 12)
		{
			useStringCard = "Queen";
		}
		else if(useCard == 13)
		{
			useStringCard = "King";
		}
		else
		{
			useStringCard = "Ace";
		}
		
		if(compCard == 2)
		{
			compStringCard = "2";
		}
		else if(compCard == 3)
		{
			compStringCard = "3";
		}
		else if(compCard == 4)
		{
			compStringCard = "4";
		}
		else if(compCard == 5)
		{
			compStringCard = "5";
		}
		else if(compCard == 6)
		{
			compStringCard = "6";
		}
		else if(compCard == 7)
		{
			compStringCard = "7";
		}
		else if(compCard == 8)
		{
			compStringCard = "8";
		}
		else if(compCard == 9)
		{
			compStringCard = "9";
		}
		else if(compCard == 10)
		{
			compStringCard = "10";
		}
		else if(compCard == 11)
		{
			compStringCard = "Jack";
		}
		else if(compCard == 12)
		{
			compStringCard = "Queen";
		}
		else if(compCard == 13)
		{
			compStringCard = "King";
		}
		else
		{
			compStringCard = "Ace";
		}
		}

		if((compCard > useCard) && (warCount != 0))
		{
			System.out.println("I win!");
			compScore = compScore + (1+ (4 * warCount));
			useScore = useScore - (1+(4 * warCount));
		}
		else if((compCard < useCard) && (warCount != 0))
		{
			System.out.println("You win!");
			compScore = compScore - (1+(4 * warCount));
			useScore = useScore + (1+(4 * warCount));
		}
		
		System.out.println("My card: " + compStringCard);
		System.out.println("Your card: " + useStringCard);
		System.out.println("My score: " + compScore);
		System.out.println("Your score: " + useScore);
		}while((useScore < 52) && (compScore < 52));
		
		System.out.println("Game over!");	
		if(useScore > compScore)
		{
			System.out.println("You win!");
			balance = balance + (2 * bet);
		}
		else
		{
			System.out.println("I win!");
		}
		
		System.out.print("Play again? Your balance is " + balance + " (Y/N): ");
		conf = SavitchIn.readLineNonwhiteChar();
		}while (conf == 'Y');
		
	}
}