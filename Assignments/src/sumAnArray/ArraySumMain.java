package sumAnArray;

import java.util.Iterator;
import java.util.Scanner;

public class ArraySumMain {
	public static Scanner input = new Scanner(System.in);
	public static int[] arrMain = new int[5];

	public static void main(String[] args) {
		sumArrayAndPrint(addToArray(arrMain));
	}

	public static int[] addToArray(int[] arrMain) {
		for (int i = 0; i < arrMain.length; i++) {
			if (i == arrMain[0]) {
				System.out.println("Enter a number");
				arrMain[i] = input.nextInt();
			} else {
				System.out.println("Enter another number");
				arrMain[i] = input.nextInt();
			}
		}
		return arrMain;
	}

	public static void sumArrayAndPrint(int[] arrMain) {
		int sum = 0;
		for (int i = 0; i < arrMain.length; i++) {
			sum += arrMain[i];
		}
		System.out.println("The total sum of the array is: " + sum);
	}

}
