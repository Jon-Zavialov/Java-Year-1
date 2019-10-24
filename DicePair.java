public class DicePair
{
	public static void main(String[] args)
	{
		double sevens = 0;
		int snakes = 0;
		int hard = 0;
		int easy = 0;
		int great = 0;
		
		for(int x = 1;	x <= 50;	x++)
		{
			int die1 = (int)(Math.random()*6+1);
			int die2 = (int)(Math.random()*6+1);
			
			System.out.println("You rolled a " + die1 + " and a " + die2 + "!");
			
			if(die1 + die2 == 7)
			{
				sevens++;
			}
			else if((die1 == 1) && (die2 == 1))
			{
				snakes++;
			}
			else if((die1 == 4) && (die2 == 4))
			{
				hard++;
			}
			else if(die1 + die2 == 8)
			{
				easy++;
			}
			
			if(die1 > die2)
			{
				great++;
			}
		}
		
		sevens = (sevens/50)*100;
		System.out.println("You rolled a seven on " + (int)(sevens) + "% of your rolls.");
		System.out.println("You rolled \"Snake Eyes\" " + snakes + " times.");
		System.out.println("You rolled \"Hard Eight\" " + hard + " times.");
		System.out.println("You rolled \"Easy Eight\" " + easy + " times.");
		System.out.println("Your first die was greater than your second die " + great + " times.");
	}
}