package findNumberFactorials;

public class FindFactorialMain {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(findFactorial(num));
		System.out.println(findFactorialIter(num));
	}

	// recursion
	public static int findFactorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * findFactorial(num - 1);
		}
	}
	
	// iteration
	public static int findFactorialIter(int num) {
		int result = 1;
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

}
