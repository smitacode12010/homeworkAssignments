package findPrimeNumber;

public class PrimeNumberMain {

	public static void main(String[] args) {
		int prime = 12;
		System.out.println(isPrime(prime));
	}

	public static boolean isFactor(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		return false;
	}

	public static boolean isPrime(int value) {
		if (value <= 1) {
			return false;
		}
		for (int i = 2; i < value; i++) {
			if (isFactor(value, i)) {
				return false;
			}
		}
		return true;
	}

}
