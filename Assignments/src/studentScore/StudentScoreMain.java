package studentScore;

import java.util.Iterator;
import java.util.Scanner;

public class StudentScoreMain {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number of students");
		int students = input.nextInt();
		submitScores(students);
	}

	public static void submitScores(int students) {
		int[] scores = new int[students];
		for (int i = 1; i <= students; i++) {
			System.out.println("Please enter student " + i + " score");
			int score = input.nextInt();
			scores[i - 1] = score;
		}
		printArray(scores);
	}

	public static void printArray(int[] arr) {
		System.out.println("++++++++RESULTS+++++++++");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Student #" + (i + 1) + " | Score: " + arr[i]);
			System.out.println();
		}
		System.out.println("________________________");
	}

}
