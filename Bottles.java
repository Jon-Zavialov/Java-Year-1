public class Bottles
{
	public static void main(String[] args)
	{
		int bottles = 100;
		int x = 1;
		
		while (x > 0)
		{
			while (bottles > 2)
			{
				System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, take one down, pass it around, " + (bottles-1) + " bottles of beer on the wall!\n");
				bottles = bottles - 1;
			}
		
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, take one down, pass it around, " + (bottles-1) + " bottle of beer on the wall!\n");
		
			System.out.println("1 bottle of beer on the wall, 1 bottle of beer, take one down, pass it around, no more bottles of beer on the wall!\n\nNo more bottles of beer on the wall, no more bottles of beer. \nGo to the store and buy some more, 99 bottles of beer on the wall.\n");
		}
	}
}