  public class Initials
{
	public static void main(String[] args)
	{
		String name = "";
		int length = 0;
		int outLength = 0;
		char firstIn = ' ';
		char lastIn = ' ';
		int space = 0;
		
		System.out.println("Please input your full name:");
		name = SavitchIn.readLine();
		
		length = name.length();
		outLength = length - 1;
		
		System.out.println("\nThere are " + outLength + " characters in your name.");
		
		if(outLength%2 == 0)
		{
			System.out.println(outLength + " is an even number.");
		}
		else
		{
			System.out.println(outLength + " is an odd number.");
		}
		
		if(outLength%3 == 0)
		{
			System.out.println(outLength + " is divisible by 3.");
		}
		else
		{
			System.out.println(outLength + " is not divisible by 3.");
		}
		
		name = name.toUpperCase();
		firstIn = name.charAt(0);
		space = name.indexOf(' ') + 1;
		lastIn = name.charAt(space);
		
		System.out.println("Your initials are " + firstIn + "." + lastIn + ".\n");
	}
}