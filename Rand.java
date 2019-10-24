public class Rand
{
	public static void main(String[] args)
	{
		int highest = 0;
		int lowest = 0;
		int total = 0;
		int dig2 = 0;
		int evens = 0;
		
		for (int x = 1; x<=12; x++)
		{
			int rand = (int)(Math.random()*125+1);
			
			System.out.println(rand);
			
			if(x == 1)
			{
				lowest = rand;
			}
			
			if(rand > highest)
			{
				highest = rand;
			}
			else if(rand < lowest)
			{
				lowest = rand;
			}
			
			total = total + rand;
			
			if(rand < 100)
			{
				dig2++;
			}
			
			if(rand%2 == 0)
			{
				evens++;
			}
		}
		
		System.out.println("\nThe highest number was " + highest + ".");
		System.out.println("The lowest number was " + lowest + ".");
		System.out.println("The average is " + total/12 + ".");
		System.out.println("There were " + dig2 + " 2 digit numbers.");
		System.out.println("There were " + evens + " even numbers, and " + (12-evens) + " odd numbers.");
	}
}		