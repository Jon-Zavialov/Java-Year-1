  public class NameLooker
{
	public static void main(String[] args)
	{
		String name = "";
		int firNameSp = 0;
		String firName = "";
		String midNameSub = "";
		int midNameSp = 0;
		String midName = "";
		int length = 0;
		String laName = "";
		int midNameSubLength = 0;
		char firIn = ' ';
		char midIn = ' ';
		char laIn = ' ';
		int firNameLength = 0;
		int midNameLength = 0;
		int laNameLength = 0;
		
		System.out.println("Please enter your full name, including your middle name. \nIf you dont have a middle name, make one up.");
		name = SavitchIn.readLine();
		
		firNameSp = name.indexOf(" ");
		firName = name.substring(0,firNameSp);
		length = name.length();
		midNameSub = name.substring(firNameSp + 1,length);
		midNameSp = midNameSub.indexOf(" ");
		midName = midNameSub.substring(0,midNameSp);
		midNameSubLength = midNameSub.length();
		laName = midNameSub.substring(midNameSp + 1,midNameSubLength);
		firIn = firName.charAt(0);
		midIn = midName.charAt(0);
		laIn = laName.charAt(0);
		firNameLength = firName.length();
		midNameLength = midName.length();
		laNameLength = laName.length();
		
		System.out.println("\n" + firName + "\n" + midName + "\n" + laName + "\n");
		System.out.println(firIn + "." + midIn + "." + laIn + ".\n");
		
		if((firNameLength > midNameLength) && (firNameLength > laNameLength))
		{
			System.out.println("Your first name is the longest");
		}
		else if((midNameLength > firNameLength) && (midNameLength > laNameLength))
		{
			System.out.println("Your middle name is the longest");
		}
		else if((laNameLength > firNameLength) && (laNameLength > midNameLength))
		{
			System.out.println("Your last name is the longest");
		}
		else if(laNameLength == firNameLength)
		{
			System.out.println("Your first name is the longest");
		}
		else if(laNameLength == midNameLength)
		{
			System.out.println("Your middle name is the longest");
		}
		else
		{
			System.out.println("Your first name is the longest");
		}
	}
}