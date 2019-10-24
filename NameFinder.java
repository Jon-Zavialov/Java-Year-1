  public class NameFinder
{
	public static void main(String[] args)
	{
		String sent = "";
		int jon = 0;
		
		System.out.println("Please enter a full sentance:");
		sent = SavitchIn.readLine();
		
		sent = sent.toLowerCase();
		
		jon = sent.indexOf("jon");
		
		if(jon == -1)
		{
			System.out.println("\nThe name Jon is not in the sentance.\n");
		}
		else
		{
			System.out.println("\nThe name Jon is in the sentance at index #" + jon + ".\n");
		}
	}
}