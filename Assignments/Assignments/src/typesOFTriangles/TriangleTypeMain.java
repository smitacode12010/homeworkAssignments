package typesOFTriangles;

import java.util.Scanner;

public class TriangleTypeMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("WELCOME TO TRIANGLE LAND");
		System.out.println("Enter your first side:");
		int sideOne = input.nextInt();
		System.out.println("Enter your second side: ");
		int sideTwo = input.nextInt();
		System.out.println("Enter your third side: ");
		int sideThree = input.nextInt();
		if (sideOne == sideTwo && sideOne == sideThree) {
			System.out.println("This is an equilateral triangle, all three sides have equal length");
		} else if (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) {
			System.out.println("This is an isoceles triangle, at least two sides must have equal length to qualify");
		} else {
			System.out.println("This is a scalene triangle, where none of the sides' length are equal to one another");
		}
	}

}
