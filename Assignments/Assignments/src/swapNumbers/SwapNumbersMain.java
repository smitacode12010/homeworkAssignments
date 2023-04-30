package swapNumbers;

public class SwapNumbersMain {

	public static void main(String[] args) {
		int[] arr = {1, 2};
		printArray(swapNumbersWithTemp(arr));
		printArray(swapNumberWithoutTemp(arr));
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] swapNumbersWithTemp(int[] arr) {
		int temp = 0;
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length - 1; i++) {
			temp = arr[0];
			newArr[i] = arr[arr.length - 1];
		}
		newArr[newArr.length - 1] = temp;
		return newArr;
	}
	
	public static int[] swapNumberWithoutTemp(int[] arr) {
		int[] newArr = new int[arr.length];
		int j = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newArr[j++] = arr[i];
		}
		return newArr;
	}

}
