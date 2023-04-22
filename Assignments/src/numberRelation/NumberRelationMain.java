package numberRelation;

import java.util.Scanner;

public class NumberRelationMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1 = input.nextInt();
		System.out.println("Please enter another number");
		int num2 = input.nextInt();
		
		System.out.println("RESULT:");
		if(num1 > num2) {
			System.out.println("The first number entered (" + num1 + ") is greater than the second number entered (" + num2 + ")");
		} else if( num1 < num2) {
			System.out.println("The first number entered (" + num1 + ") is less than the second number entered (" + num2 + ")");
		} else {
			System.out.println("The first number (" + num1 + ") and the second number (" + num2 + ") entered are equal");
		}
	}

}
