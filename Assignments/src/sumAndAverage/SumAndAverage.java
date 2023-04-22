package sumAndAverage;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		System.out.println("Enter another number");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		int average = sum / 2;
		System.out.println("The sum of both numbers is: " + sum);
		System.out.println("The average of both numbers is: " + average);
		
	}

}


