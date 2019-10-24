public class GradeCalculator
{
	public static void main(String[] args)
	{
		int quizOne = 0;
		int quizTwo = 0;
		int quizThree = 0;
		int quizFour = 0;
		int quizFive = 0;
		int average = 0;
		
		System.out.println("----------JON'S GRADE CALCULATOR-----\n");
		System.out.println("\nWelcome to Jon's grade calculator! Please enter your percentage of your first quiz");
		
			quizOne = SavitchIn.readLineInt(); //setting a value to each variable inputed by user
		
		System.out.println("\nGreat! Now enter your percentage for quiz two.");
	
			quizTwo = SavitchIn.readLineInt();
		
		System.out.println("\nGreat! Now enter your percentage for quiz three.");
		
			quizThree = SavitchIn.readLineInt();
		
		System.out.println("\nGreat! Now enter your percentage for quiz four.");
		
			quizFour = SavitchIn.readLineInt();
		
		System.out.println("\nGreat! Now enter your percentage for quiz five.");
		
			quizFive = SavitchIn.readLineInt();
		
		average = ((quizOne + quizTwo + quizThree + quizFour + quizFive)/5);
		
		System.out.println("\nThe average of your five quizes is " + average + "%. Great job!\n\n");
		
	}
}