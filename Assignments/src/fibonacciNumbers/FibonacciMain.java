package fibonacciNumbers;

import java.util.Iterator;

public class FibonacciMain {

	public static void main(String[] args) {
			int test = 11;
			System.out.println(findFibonacciNumbersRecursion(test));
			System.out.println(findFibonacciNumbersIteration(test));
	}
	
	//using recursion
	public static int findFibonacciNumbersRecursion(int test) {
		if(test == 0 || test == 1) {
			return test;
		}
		return findFibonacciNumbersRecursion(test - 1) + findFibonacciNumbersRecursion(test - 2);
	}
	
	// using iteration
	public static int findFibonacciNumbersIteration(int test) {
		if(test == 0 || test == 1) {
			return test;
		}
		int numOne = 0, numTwo = 1;
		int temp;
		for (int i = 2; i <= test; i++) {
			temp = numOne + numTwo;
			numOne = numTwo;
			numTwo = temp;
		}
		return numTwo;
	}

}
