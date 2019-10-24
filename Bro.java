public class Bro
{
	public static void main(String[] args)
	{
		String name = "";
		int age = 0;
		String food = "";
		String hobby = "";
		
		System.out.println("Hi! What's your name?");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi " + name + "!\n\nHow old are you?");
		age = SavitchIn.readLineInt();
		
		if(age > 10)
		{
			System.out.println("\nOk, you're a big kid.");
		}
		else
		{
			System.out.println("\nHAHA, BABY!!!");
		}
		
		System.out.println("\nOk " + name + ", so, what's your favorite food?");
		food = SavitchIn.readLine();
		
		System.out.println("\nWhatever. What's your favorite hobby?");
		hobby = SavitchIn.readLine();
		
		System.out.println("\nOk, " + food + " and " + hobby + " are nice, but I like eating meatloaf in the bathroom.\n\n");
		
	}
}