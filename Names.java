  public class Names
{
	public static void main(String[] args)
	{
		String fName = "";
		String lName = "";
		char thirdL = 0;
		char lastL = 0;
		int length = 0;
		int test = 0;

		System.out.println("Please input your first name:");
		fName = SavitchIn.readLine();
		
		System.out.println("\nPlease input your last name:");
		lName = SavitchIn.readLine();
		
		fName = fName.toLowerCase();
		lName = lName.toLowerCase();
		
		if((fName.equals("quinn")) || (lName.equals("quinn")))
		{
			System.out.println("\nI LOVE your shirt!");
		}
		else
		{
			System.out.println("\nYou smell!");
		}
		
		thirdL = fName.charAt(2);
		length = lName.length();
		test = length - 1;
		lastL = lName.charAt(test);
		
		System.out.println("\nThe third letter of your first name is " + thirdL + ", and the last letter of your last name is " + lastL + ".\n");
	}
}
