public class Calculator
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		String num1Str = "";
		String num2Str = "";
		String opStr = "";
		char op = ' ';
		int ans = 0;
		String ansStr = "";
		char conf = ' ';
		String fullStr = "";
		char y = ' ';
		
		do
		{
		System.out.print("Welcome to the Java Calculator created by Jon Zavialov! \nPlease input the operation (A = Add, S = Subtract, M = Multiply, D = Divide): ");
		op = SavitchIn.readLineNonwhiteChar();
		
		while((op != 'A') && (op != 'S') && (op != 'M') && (op != 'D'))
		{
			System.out.print("Invalid operation! Check the operation codes above and enter the operation. (Capitals matter): ");
			op = SavitchIn.readLineNonwhiteChar();
		}
		
		System.out.print("\nGreat! Now type in your first number: ");
		num1 = SavitchIn.readLineInt();
		
		System.out.print("\nGreat! Now type in your second number: ");
		num2 = SavitchIn.readLineInt();
		
		if(op == 'A')
		{
			ans = num1 + num2;
			opStr = " + ";
		}
		else if(op == 'S')
		{
			ans = num1 - num2;
			opStr = " - ";
		}
		else if(op == 'M')
		{
			ans = num1 * num2;
			opStr = " X ";
		}
		else
		{
			ans = num1 / num2;
			opStr = " / ";
		}
		
		System.out.println("\n");
		
		num1Str = Integer.toString(num1);
		num2Str = Integer.toString(num2);
	 	ansStr = Integer.toString(ans);
		fullStr = num1Str + opStr + num2Str + " = " + ansStr;
		
		for(int x = 0;	x < fullStr.length();	x++)
		{
			y = fullStr.charAt(x);
			System.out.print(y);
			
			try{
			Thread.sleep(250);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
		}
		
		System.out.print("\nWould you like to calculate something else? (Y/N): ");
		conf = SavitchIn.readLineNonwhiteChar();
		}while(conf == 'Y');
	}
}