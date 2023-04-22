package roleNameNationality;

import java.util.Scanner;

public class RoleNameNationalityMain {

	public static void main(String[] args) {
		System.out.println("**********WELCOME TO THE PROGRAM************");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your role here: ");
		String role = input.nextLine();
		System.out.println("Now enter your name: ");
		String name = input.nextLine();
		System.out.println("Finally, enter your nationality: ");
		String nationality = input.next();
		System.out.println("Here are the results: \nName: " + name + "\nRole: " + role + "\nNationality: " + nationality);
	}

}
