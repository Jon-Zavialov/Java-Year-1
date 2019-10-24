public class MegaMillions2
{
	public static void main(String[] args)
	{
		int corectNums = 0;
		int corectMega = 0;
		char conf = ' ';
		int y = 1;
		double total = 0;
		int w = 0;
		int noNumOneMega = 0;
		int oneNumOneMega = 0;
		int twoNumOneMega = 0;
		int threeNumNoMega = 0;
		int threeNumOneMega =0;
		int fourNumNoMega = 0;
		int fourNumOneMega = 0;
		int fiveNumNoMega = 0;
		int fiveNumOneMega = 0;
		double overTot = 0;
		
		while(w < 1000)
		{
		total = 0;
		corectNums = 0;
		corectMega = 0;
		int num1 = (int)(Math.random()*70+1);
		
		int num2 = (int)(Math.random()*70+1);
		while(num2 == num1)
		{
			num2 = (int)(Math.random()*70+1);
		}
		
		int num3 = (int)(Math.random()*70+1);
		while((num3 == num1) || (num3 == num2))
		{
			num3 = (int)(Math.random()*70+1);
		}
		
		int num4 = (int)(Math.random()*70+1);
		while((num4 == num1) || (num4 == num2) || (num4 == num3))
		{
			num4 = (int)(Math.random()*70+1);
		}
		
		int num5 = (int)(Math.random()*70+1);
		while((num5 == num1) || (num5 == num2) || (num5 == num3) || (num5 == num4))
		{
			num5 = (int)(Math.random()*70+1);
		}
		
		int mega = (int)(Math.random()*25+1);

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

		System.out.println("The first number is " + ball1 + "!");
		
		System.out.println("The second number is " + ball2 + "!");
		
		System.out.println("The third number is " + ball3 + "!");
		
		System.out.println("The fourth number is " + ball4 + "!");
		
		System.out.println("And the last number is " + ball5 + "!");
		
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
		
		System.out.println("You got " + corectNums + " numbers right!");
		
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
			noNumOneMega++;
		}
		else if ((corectNums == 1) && (corectMega == 1))
		{
			System.out.println("You won $4!");
			total = total + 4;
			oneNumOneMega++;
		}
		else if ((corectNums == 2) && (corectMega == 1))
		{
			System.out.println("You won $10!");
			total = total + 10;
			twoNumOneMega++;
		}
		else if ((corectNums == 3) && (corectMega == 0))
		{
			System.out.println("You won $10!");
			total = total + 10;
			threeNumNoMega++;
		}
		else if ((corectNums == 3) && (corectMega == 1))
		{
			System.out.println("You won $200!");
			total = total + 200;
			threeNumOneMega++;
		}
		else if ((corectNums == 4) && (corectMega == 0))
		{
			System.out.println("You won $500!");
			total = total + 500;
			fourNumNoMega++;
		}
		else if ((corectNums == 4) && (corectMega == 1))
		{
			System.out.println("You won $10,000!");
			total = total + 10000;
			fourNumOneMega++;
		}
		else if ((corectNums == 5) && (corectMega == 0))
		{
			System.out.println("You won $1,000,000!");
			total = total + 1000000;
			fiveNumNoMega++;
		}
		else if ((corectNums == 5) && (corectMega == 1))
		{
			System.out.println("You won the jackpot!");
			total = total + 15000000;
			fiveNumOneMega++;
		}
		else
		{
			System.out.println("You didn't win anything :(");
		}
		
		System.out.println("You have $" + ((100-(2*y))+total) + " left.");
		y++;
		w++;
		overTot = total + overTot;
		}
		
		System.out.println("5 + MB = " + fiveNumOneMega);
		System.out.println("5 + No MB = " + fiveNumNoMega);
		System.out.println("4 + MB = " + fourNumOneMega);
		System.out.println("4 + No MB = " + fourNumNoMega);
		System.out.println("3 + MB = " + threeNumOneMega);
		System.out.println("3 + No MB = " + threeNumNoMega);
		System.out.println("2 + MB = " + twoNumOneMega);
		System.out.println("1 + MB = " + oneNumOneMega);
		System.out.println("0 + MB = " + noNumOneMega);
		System.out.println("The average winnings per game was $" + overTot/1000);
	}
}