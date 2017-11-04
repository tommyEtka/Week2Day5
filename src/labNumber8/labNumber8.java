package labNumber8;

import java.util.Scanner;

public class labNumber8 {

	public static void main(String[] args) {

		float batterSum = 0;
		float batterAverage = 0;
		float batterSlugging = 0;

		System.out.println("Welcome to Batting Average Calculator!");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of times at bat?");
		float batterInput = input.nextInt();

		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		float numbers[] = new float[(int) batterInput];
		// the new int[batterInput] means that the batter input is going thru
		// the numbers array
		// the new int part is for the numbers array and NOT the batter input

		// while( batterInput <0 || batterInput >4){
		// try {
		float i;
		for (i = 0; i < batterInput; i++) {
			// int i = 0 means i is going to start at zero
			// i<batterInput means i will go until it is less than num (which is
			// whatever the user put in)
			// i++ means it increments by 1 so going from 0 to whatever the user
			// put in
			System.out.println("Result for at-bat " + i + ": ");
			numbers[(int) i] = input.nextInt();
		}

		for (float a : numbers)

		batterSum += a;
		batterAverage = numbers.length / batterSum;
		batterSlugging = batterSum / numbers.length;

		System.out.println("The batter average is: " + batterAverage);
		System.out.println("The slugging percentage is: " + batterSlugging);

		input.close();

	}

}
