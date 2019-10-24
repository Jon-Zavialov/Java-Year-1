  public class StringsFun1
{
	public static void main(String[] args)
	{
		String name = "";
		String sent = "";
		String lowSent = "";
		int hateIn = 0;
		int laHateIn = 0;
		String firSent = "";
		String laSent = "";
		int length = 0;
		
		System.out.println("I'm so sorry about your grade. What's your teacher's name?");
		name = SavitchIn.readLine();
		
		System.out.println("\nI heard " + name + " sucks. Im sorry you have her. Is there something you hate about her?");
		sent = SavitchIn.readLine();
		
		lowSent = sent.toLowerCase();
		hateIn = lowSent.indexOf("hate");
		
		laHateIn = hateIn + 5;
		firSent = sent.substring(0, hateIn);
		length = sent.length();
		laSent = sent.substring(laHateIn,length);
		
		System.out.println("\nLet me help you by changing your mindset: " + firSent + "love " + laSent + "!\n");
	}
}