package labNumber8;

import java.util.Scanner;

public class labNumber8NoNotes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i;
		float batterCount = 0;
		float batterSum = 0;
		float batterAverage = 0;
		float batterSlugging = 0;
		int batterResult = 0;
		String loopContinue = "yes";

		System.out.println("Welcome to Batting Average Calculator!");

		while (loopContinue.equalsIgnoreCase("yes")) {

			System.out.println("How many times has the batter been at bat?");

			int batterInput = input.nextInt();

			System.out
					.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			int numbers[] = new int[batterInput];

			for (i = 0; i < batterInput; i++) {

				System.out.println("Result for at-bat " + i + ": ");
				batterResult = input.nextInt();
				input.nextLine();

				
				//try doing a try catch here
				if (batterResult <= 4 && batterResult >= 0) {
					numbers[i] = batterResult;
				
				} else {
					System.out.println("Invalid input");
					i--;
			
				}
				if (batterResult > 0 && batterResult <= 4)
					batterCount++;
			
			}
			for (float a : numbers)

				batterSum += a;
			batterAverage = numbers.length / batterSum;
			batterSlugging = batterSum / numbers.length;

			System.out.println("The batter average is: " + batterAverage);
			System.out.println("The slugging percentage is: " + batterSlugging);

			System.out.println("Another Batter? yes or no");
			loopContinue = input.nextLine();

		}
		System.out.println("Goodbye");
		input.close();
	}

}
