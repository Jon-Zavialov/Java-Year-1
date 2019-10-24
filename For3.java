public class For3
{
	public static void main(String[] args)
	{
		int enemies = 0;
		int age = 0;
		int x = 0;
		int total = 0;
		int twenty = 0;
		int over16 = 0;
		int twenty3 = 0;
		int high = 0;
		int low = 0;
		int prevAge = 0;
		int div6 = 0;
		
		System.out.print("How many enemies do you have? (No less than 5, no more than 10): ");
		enemies = SavitchIn.readLineInt();
		
		while ((enemies < 5) || (enemies > 10))
		{
			System.out.print("Invalid input! Please try again: ");
			enemies = SavitchIn.readLineInt();
		}
		
		do
		{
			System.out.print("\nOk! What's the age of enemy #" + (x+1) + "?: ");
			age = SavitchIn.readLineInt();
			
			total = age + total;
			
			x++;
			if(x == 1)
			{
				low = age;
			}
			
			if(age == 111)
			{
				break;
			}
			
			if(age >= 16)
			{
				over16++;
			}
			
			if((age > 19) && (age < 30))
			{
				twenty++;
			}
			
			if(age == 23)
			{
				twenty3++;
			}
			
			if(age > high)
			{
				high = age;
			}
			else if(age == high)
			{
			}
			else if (age < low)
			{
				low = age;
			}
			
			if(age%6 == 0)
			{
				div6++;
			}
		}while((x+1) <= enemies);
		
		System.out.println("\nGreat! The average age is " + total/enemies + ".");
		System.out.println(over16 + " of your enemies are 16 or older.");
		System.out.println(twenty + " of your enemies are in their twenties.");
		System.out.println(twenty3 + " of your enemies are 23.");
		System.out.println(high + " is the oldest age.");
		System.out.println(low + " is the youngest age.");
		System.out.println(div6 + " ages are divisible by 6");
	}
}