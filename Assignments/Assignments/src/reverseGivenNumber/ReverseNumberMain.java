package reverseGivenNumber;

public class ReverseNumberMain {

	public static void main(String[] args) {
		int num = 123;
		System.out.println(reverseNum(num));
	}

	public static int reverseNum(int num) {
		int reversedNumber = 0;
		// make sure number is not negative
		int numberToReverse = Math.abs(num);

		while (numberToReverse > 0) {
			int mod = numberToReverse % 10;
			reversedNumber = reversedNumber * 10 + mod;
			numberToReverse /= 10;
		}

		return num < 0 ? reversedNumber * -1 : reversedNumber;
	}

}
