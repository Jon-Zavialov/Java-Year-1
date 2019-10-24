public class NumSorter
{
	public static void main(String[] args)
	{
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int highest = 0;
		int lowest = 0;
		int mid1 = 0;
		int mid2 = 0;
		int mid3 = 0;
		int mid4 = 0;
		int mid5 = 0;
		String nums = "";
		String smid1 = "";
		String smid2 = "";
		String smid3 = "";
		String smid4 = "";
		String smid5 = "";
		String comma = ",";
		int zeroComma = 0;
		int zeroComma2 = 0;
		String befNums = "";
		String afNums = "";
		int secComma = 0;
		int highestMid = 0;
		int lowestMid = 0;
		int mid = 0;

		System.out.println("Welcome to number sorter! Input five whole numbers, and I will sort them from smallest to largest! \nIt cannot be zero.");
		
		System.out.print("#1: ");
		num1 = SavitchIn.readLineInt();
		
		while(num1 == 0)
		{
			System.out.print("It cannot be zero! Please try again: ");
			num1 = SavitchIn.readLineInt();
		}
		
		highest = num1;
		lowest = num1;
		
		System.out.print("#2: ");
		num2 = SavitchIn.readLineInt();
		
		while((num2 == 0) || (num2 == num1))
		{
			System.out.print("Invalid! Please check the rules and try again: ");
			num2 = SavitchIn.readLineInt();
		}
		
		if(num2 > highest)
		{
			highest = num2;
		}
		else if(num2 < lowest)
		{
			lowest = num2;
		}
		
		System.out.print("#3: ");
		num3 = SavitchIn.readLineInt();
		
		while((num3 == 0) || (num2 == num3) || (num3 == num1))
		{
			System.out.print("Invalid! Please check the rules and try again: ");
			num3 = SavitchIn.readLineInt();
		}
		
		if(num3 > highest)
		{
			highest = num3;
		}
		else if(num3 < lowest)
		{
			lowest = num3;
		}
		
		System.out.print("#4: ");
		num4 = SavitchIn.readLineInt();
		
		while((num4 == 0) || (num4 == num1) || (num4 == num2) || (num4 == num3))
		{
			System.out.print("Invalid! Please check the rules and try again: ");
			num4 = SavitchIn.readLineInt();
		}
		
		if(num4 > highest)
		{
			highest = num4;
		}
		else if(num4 < lowest)
		{
			lowest = num4;
		}
		
		System.out.print("#5: ");
		num5 = SavitchIn.readLineInt();
		
		while((num5 == 0) || (num5 == num4) || (num5 == num3) || (num5 == num2) || (num5 == num1))
		{
			System.out.print("Invalid! Please check the rules and try again: ");
			num5 = SavitchIn.readLineInt();
		}
	
		if(num5 > highest)
		{
			highest = num5;
		}
		else if(num5 < lowest)
		{
			lowest = num5;
		}
		
		if((num1 != lowest) && (num1 != highest))
		{
			mid1 = num1;
		}
		
		if((num2 != lowest) && (num2 != highest))
		{
			mid2 = num2;
		}
		
		if((num3 != lowest) && (num3 != highest))
		{
			mid3 = num3;
		}
		
		if((num4 != lowest) && (num4 != highest))
		{
			mid4 = num4;
		}
		
		if((num5 != lowest) && (num5 != highest))
		{
			mid5 = num5;
		}
		
		smid1 =  Integer.toString(mid1);
		smid2 =  Integer.toString(mid2);
		smid3 =  Integer.toString(mid3);
		smid4 =  Integer.toString(mid4);
		smid5 =  Integer.toString(mid5);

		nums = comma + smid1 + comma + comma + smid2 + comma + comma + smid3 + comma + comma + smid4 + comma + comma + smid5 + comma;
		
		zeroComma = nums.indexOf(",0,");
		befNums = nums.substring(0,zeroComma);
		zeroComma = zeroComma + 3;
		afNums = nums.substring(zeroComma, nums.length());
		nums = befNums + afNums;
		
		zeroComma = nums.indexOf(",0,");
		befNums = nums.substring(0,zeroComma);
		zeroComma = zeroComma + 3;
		afNums = nums.substring(zeroComma, nums.length());
		nums = befNums + afNums;
		
		smid1 = nums.substring(1,nums.length());
		secComma = smid1.indexOf(',');
		nums = smid1.substring(secComma+1,smid1.length());
		smid1 = smid1.substring(0,secComma);
		
		smid2 = nums.substring(1,nums.length());
		secComma = smid2.indexOf(',');
		nums = smid2.substring(secComma+1,smid2.length());
		smid2 = smid2.substring(0,secComma);
		
		smid3 = nums.substring(1,nums.length()-1);
		
		mid1 = Integer.parseInt(smid1);
		mid2 = Integer.parseInt(smid2);
		mid3 = Integer.parseInt(smid3);
		
		highestMid = mid1;
		lowestMid = mid1;
		
		if(mid2 > highestMid)
		{
			highestMid = mid2;
		}
		else if (mid2 < lowestMid)
		{
			lowestMid = mid2;
		}
		
		if(mid3 > highestMid)
		{
			highestMid = mid3;
		}
		else if (mid3 < lowestMid)
		{
			lowestMid = mid3;
		}
		
		if((mid1 != highestMid) && (mid1 != lowestMid))
		{
			mid = mid1;
		}
		else if((mid2 != highestMid) && (mid2 != lowestMid))
		{
			mid = mid2;
		}
		else
		{
			mid = mid3;
		}
		
		System.out.print("Calculating ");
		
		System.out.print(". ");
		
		try{
		Thread.sleep(750);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(". ");
		
		try{
		Thread.sleep(750);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(". ");
		
		try{
		Thread.sleep(750);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(". ");
		
		try{
		Thread.sleep(750);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.print(". ");
		
		try{
		Thread.sleep(750);        // 3000 = 3 second delay
		}catch(InterruptedException ie){
		ie.printStackTrace();
		}
		
		System.out.println("\nYour numbers sorted are : " + lowest + ", " + lowestMid + ", " + mid + ", " + highestMid + ", " + highest);
	}
}