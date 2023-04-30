package fourFunctionCalculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = input.nextInt();
		System.out.println("Enter another number");
		int num2 = input.nextInt();
		System.out.println("Enter one of the following:");
		System.out.println("'+' for addition");
		System.out.println("'-' for subtraction");
		System.out.println("'*' for multiplication");
		System.out.println("'/' for division");
		char symbol = input.next().charAt(0);
		if (symbol == '+') {
			int addition = num1 + num2;
			System.out.println("Addition: " + addition);
		} else if(symbol == '-') {
			int subtract = num1 - num2;
			System.out.println("Subtraction: " + subtract);
		}else if(symbol == '*') {
			int multiply = num1 * num2;
			System.out.println("Multiplication: " + multiply);
		} else if(symbol == '/') {
			int divide = num1 / num2;
			System.out.println("Division: " + divide);
		} else {
			System.out.println("Wrong character, please try again");
		}


	}

}
