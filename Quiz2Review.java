public class Quiz2Review
{
	public static void main(String[] args)
	{
		String name = "";
		String city = "";
		int time = 0;
		char ind4 = ' ';
		int length = 0;
		int finT = 0;
		int adress = 0;
		
		System.out.println("Hello! Please input your full name.");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi " + name + "! What city were you born in?");
		city = SavitchIn.readLine();
		
		city = city.toLowerCase();
		
		if(city.equals("buckingham"))
		{
			System.out.println("\nBuckingham is a great city!");
		}
		else 
		{
			System.out.println("\nNasty!");
		}
		
		System.out.println("\nHow many minutes does it take you to get to school, " + name + "?");
		time = SavitchIn.readLineInt();
		
		if((time > 20) || (time < 5))
		{
			System.out.println("\nThat's unusual!");
		}
		else
		{
			System.out.println("\nThat's a pretty normal time!");
		}
		
		ind4 = city.charAt(4);
		length = city.length();
		finT = city.indexOf('t');
		
		System.out.println("\nThe fifth letter of " + city + " is " + ind4 + ", and it is " + length + " letters long.");
		
		if(finT == -1)
		{
			System.out.println("There are no T's in " + city + "!");
		}
		else
		{
			System.out.println("T is located at index #" + finT + " in " + city + "!");
		}
		
		System.out.print("Please enter the number part of your house number: ");
		adress = SavitchIn.readLineInt();
		
		if(adress%3 == 0)
		{
			System.out.println("\n" + adress + " is divisible by 3!");
		}
		else
		{
			System.out.println("\n" + adress + " is not kdivisible by 3!");
		}
	}
}