import java.text.DecimalFormat;

public class RoundTest
{
	public static void main(String[] args)
	{
		double x = 0;
		String result = "";
		
		x = 11234.3682;
		
		DecimalFormat test = new DecimalFormat("#.##");
		
		result = test.format(x);
		System.out.println (result);
	}	
}