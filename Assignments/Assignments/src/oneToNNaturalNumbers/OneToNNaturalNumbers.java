package oneToNNaturalNumbers;

public class OneToNNaturalNumbers {

	public static void main(String[] args) {
		int num = 35;
		if(num > 0) {
		System.out.println(findNaturalNumberSum(num));
		} else {
			System.out.println("Not a natural number");
		}
	}
	
	public static int findNaturalNumberSum(int num) {
		int sum = (num * (num + 1) / 2);
		return sum;
	}

}
