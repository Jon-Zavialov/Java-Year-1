public class LoopAssn
{
	public static void main(String[] args)
	{
		int x = 1;
		
		while (x < 21)
		{
			System.out.println(x);
			x = x + 1;
		}
		
		System.out.println("\n");
		
		while (x > 1)
		{
			x = x - 1;
			System.out.println(x);
		}
		
		System.out.println("\n");
		
		while (x < 21)
		{
			System.out.println(x);
			x = x + 2;
		}
		
		x = 2;
		System.out.println("\n");
		
		while (x < 21)
		{
			System.out.println(x);
			x = x + 2;
		}
		
		x = 1;
		System.out.println("\n");
		
		while (x < 21)
		{
			System.out.println(x);
			x = x + 3;
		}
	}
}