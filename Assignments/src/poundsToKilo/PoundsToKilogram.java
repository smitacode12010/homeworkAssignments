package poundsToKilo;

import java.util.Scanner;

public class PoundsToKilogram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of pounds: ");
		double lbs = input.nextDouble();
		
		double conversion = lbs / 2.2;
		System.out.println("Weight in kg: " + String.format("%.3f", conversion));
	}

}
