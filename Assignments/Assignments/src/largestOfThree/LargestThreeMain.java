package largestOfThree;

public class LargestThreeMain {

	public static void main(String[] args) {
		int num1 = 54;
		int num2 = 94;
		int num3 = 54;
		System.out.println("Largest of three is " + findLargestOfThree(num1, num2, num3));
	}
	
	public static int findLargestOfThree(int num1, int num2, int num3) {
		int largest = num1;
		if(num2 >= largest) {
			largest = num2;
		}
		if(num3 >= largest) {
			largest = num3;
		}
		return largest;
	}

}
