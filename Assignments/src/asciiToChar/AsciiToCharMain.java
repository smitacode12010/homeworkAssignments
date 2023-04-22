package asciiToChar;

import java.util.Scanner;

public class AsciiToCharMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***********ASCII CONVERTER************");
		System.out.println("Please enter an ASCII value between 0 and 128");
		int ascii = input.nextInt();
		if(ascii >= 0 && ascii <= 128) {
			char conversion = (char) ascii;
			System.out.println("Character associated with value " + ascii + " is '" + conversion + "' ");
		} else {
			System.out.println("OUT OF RANGE");
		}
	}

}
