package enterNegativeNumber;

import java.util.Scanner;

public class NegativeNumberMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a negative whole number here: ");
		int num = input.nextInt();
		if(num < 0) {
			System.out.println("The number you entered is " + num);
		} else {
			System.out.println("Please enter a negative number");
		}
	}

}
