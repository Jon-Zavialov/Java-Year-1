public class TriMaker
{
	public static void main(String[] args)
	{
		int size = 0;
		int y = 0;
		int x = 0;
		int w = 0;
		int z = 0;
		
		System.out.print("How big would you like the triagle to be? (Max 20): ");
		size = SavitchIn.readLineInt();
		
		while ((size <= 0) || (size > 20))
		{
			System.out.print("Invalid! Please try again: ");
			size = SavitchIn.readLineInt();
		}
		
		while ( x <= ((size*2) - 1))
		{
			y = 0;
			
			if (x <= size)
			{
				while (y < x)
				{
					System.out.print("*");
					y++;
				}
				
			}
			else
			{
				if (z == 0)
				{
					w = x;
					z++;
					y = w-1;
				}
				
				y = 0;
				while (y < w-2)
				{
					System.out.print("*");
					y++;
				}
				
				w--;
			}
			
			x++;
			
			System.out.print("\n");
		}
	}
}