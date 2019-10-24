public class MegaMillions
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int mega = 0;
		int corectNums = 0;
		int corectMega = 0;
		char conf = ' ';
		int y = 1;
		int total = 0;
		
		do
		{
		corectNums = 0;
		corectMega = 0;
		System.out.println("Welcome to the Mega Millions! Please pick your lottery numbers, \nthey must be between 1 and 70, and they cannot be repeating: ");
	
		System.out.print("#1: ");
		num1 = SavitchIn.readLineInt();
		while((num1 > 70) || (num1 < 1))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			num1 = SavitchIn.readLineInt();
		}		
		
		System.out.print("#2: ");
		num2 = SavitchIn.readLineInt();
		while((num2 > 70) || (num2 < 1) || (num1 == num2))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			num2 = SavitchIn.readLineInt();
		}
	
		System.out.print("#3: ");
		num3 = SavitchIn.readLineInt();
		while((num3 > 70) || (num3 < 1) || (num1 == num3) || (num3 == num2))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			num3 = SavitchIn.readLineInt();
		}
	
		System.out.print("#4: ");
		num4 = SavitchIn.readLineInt();
		while((num4 > 70) || (num4 < 1) || (num1 == num4) || (num2 == num4) || (num3 == num4))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			num4 = SavitchIn.readLineInt();
		}
	
		System.out.print("#5: ");
		num5 = SavitchIn.readLineInt();
		while((num5 > 70) || (num5 < 1) || (num1 == num5) || (num2 == num5) || (num3 == num5) || (num4 == num5))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			num5 = SavitchIn.readLineInt();
		}
		
		System.out.println("\nGreat! Now choose a MegaBall number, this can repeat your previous choices, but it must be between 1 and 25: ");
		System.out.print("MegaBall: ");
		mega = SavitchIn.readLineInt();
		while((mega > 25) || (mega < 1))
		{
			System.out.print("Not a valid number! Please check the rules above and try again: ");
			mega = SavitchIn.readLineInt();
		}
		
		System.out.println("Great! Here's your ticket: ");
		System.out.println("\nYOUR CHOICES: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + " MEGABALL: " + mega);
		
		int ball1 = (int)(Math.random()*70+1);
		
		int ball2 = (int)(Math.random()*70+1);
		while(ball2 == ball1)
		{
			ball2 = (int)(Math.random()*70+1);
		}
		
		int ball3 = (int)(Math.random()*70+1);
		while((ball3 == ball1) || (ball3 == ball2))
		{
			ball3 = (int)(Math.random()*70+1);
		}
		
		int ball4 = (int)(Math.random()*70+1);
		while((ball4 == ball1) || (ball4 == ball2) || (ball4 == ball3))
		{
			ball4 = (int)(Math.random()*70+1);
		}
		
		int ball5 = (int)(Math.random()*70+1);
		while((ball5 == ball1) || (ball5 == ball2) || (ball5 == ball3) || (ball5 == ball4))
		{
			ball5 = (int)(Math.random()*70+1);
		}
		
		int ballmega = (int)(Math.random()*25+1);
		
		System.out.println("\nWelcome to the LIVE MegaMillion Drawing! Let's get our first ball!");
		
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}

		System.out.println("The first number is " + ball1 + "!");
	
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("The second number is " + ball2 + "!");
		
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("The third number is " + ball3 + "!");
		
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("The fourth number is " + ball4 + "!");
		
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("And the last number is " + ball5 + "!");
		
		try{
		Thread.sleep(2000);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("And finally, the MegaBall number is " + ballmega + "!");
		
		if((num1 == ball1) || (num1 == ball2) || (num1 == ball3) || (num1 == ball4) || (num1 == ball5))
		{
			corectNums++;
		}
		
		if((num2 == ball1) || (num2 == ball2) || (num2 == ball3) || (num2 == ball4) || (num2 == ball5))
		{
			corectNums++;
		}
		
		if((num3 == ball1) || (num3 == ball2) || (num3 == ball3) || (num3 == ball4) || (num3 == ball5))
		{
			corectNums++;
		}
		
		if((num4 == ball1) || (num4 == ball2) || (num4 == ball3) || (num4 == ball4) || (num4 == ball5))
		{
			corectNums++;
		}
		
		if((num5 == ball1) || (num5 == ball2) || (num5 == ball3) || (num5 == ball4) || (num5 == ball5))
		{
			corectNums++;
		}
		
		if(mega == ballmega)
		{
			corectMega++;
		}
		
		System.out.println("\nYou got " + corectNums + " numbers right!");
		
		if(corectMega == 0)
		{
			System.out.println("Unfortunatley, you did not get the MegaBall right.");
		}
		else
		{
			System.out.println("You got the MegaBall right!");
		}
		
		if((corectNums == 0) && (corectMega == 1))
		{
			System.out.println("You won $2!");
			total = total + 2;
		}
		else if ((corectNums == 1) && (corectMega == 1))
		{
			System.out.println("You won $4!");
			total = total + 4;
		}
		else if ((corectNums == 2) && (corectMega == 1))
		{
			System.out.println("You won $10!");
			total = total + 10;
		}
		else if ((corectNums == 3) && (corectMega == 0))
		{
			System.out.println("You won $10!");
			total = total + 10;
		}
		else if ((corectNums == 3) && (corectMega == 1))
		{
			System.out.println("You won $200!");
			total = total + 200;
		}
		else if ((corectNums == 4) && (corectMega == 0))
		{
			System.out.println("You won $500!");
			total = total + 500;
		}
		else if ((corectNums == 4) && (corectMega == 1))
		{
			System.out.println("You won $10,000!");
			total = total + 10000;
		}
		else if ((corectNums == 5) && (corectMega == 0))
		{
			System.out.println("You won $1,000,000!");
			total = total + 1000000;
		}
		else if ((corectNums == 5) && (corectMega == 1))
		{
			System.out.println("You won the jackpot!");
			total = total + 15000000;
		}
		else
		{
			System.out.println("You didn't win anything :(");
		}
		
		System.out.println("Play again? Tickets are $2, and you have $" + ((100-(2*y))+total) + " left. (Y/N): ");
		conf = SavitchIn.readLineNonwhiteChar();
		y++;
		}while((conf == 'Y') && (y < 50));
	}
}