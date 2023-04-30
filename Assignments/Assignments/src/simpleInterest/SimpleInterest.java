package simpleInterest;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your principle amount: ");
		int principle = input.nextInt();
		double rate = .045;
		int time = 15;
		double overallInterest = (principle * time * rate) / 100;
		System.out.println("Simple Interest accrued at 15 months and 4.5% interest: " + overallInterest);
		input.close();
	}

}
