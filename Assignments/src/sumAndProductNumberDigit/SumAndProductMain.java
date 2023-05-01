package sumAndProductNumberDigit;

public class SumAndProductMain {

	public static void main(String[] args) {
		int value = 333;
		System.out.println(findSumOfDigits(value));
		System.out.println(findProductOfDigits(value));
	}
	
	public static int findSumOfDigits(int value) {
		int sum = 0;
		while (value > 0) {
			sum += value % 10;
			value /= 10;
		}
		return sum;
	}
	
	public static int findProductOfDigits(int value) {
		int product = 1;
		while (value > 0) {
			product *= value % 10;
			value /= 10;
		}
		return product;
	}

}
