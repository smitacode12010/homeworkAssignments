package mathematicalFunctions;

public class MathFunctionsMain {

	public static void main(String[] args) {
		int velocity = 30;
		int time = 15;
		int acceleration = 5;
		System.out.println("Displacement formula: " + showMethodOne(velocity, time, acceleration));
		
		int sideOne = 12;
		int sideTwo = 13;
		int sideThree = 14;
		System.out.println("Heron's Formula: " + showMethodTwo(sideOne, sideTwo, sideThree));
		
		int a = 3;
		int b = 5;
		int c = 6;
		
		System.out.println("Quadratic Formula: " + showMethodThree(a, b, c));
		
	}

	// s = ut + 1/2 at2
	public static double showMethodOne(int velocity, int time, int acceleration) {
		double displacement = (velocity * time) + (0.5 * acceleration * (time * time));
		return displacement;
	}

	public static double showMethodTwo(int sideOne, int sideTwo, int sideThree) {
		int area = (int) ((sideOne + sideTwo + sideThree) / 2.0d);
		double heron = Math.sqrt(area * (area - sideOne) * (area - sideTwo) * (area = sideThree));
		return heron;
	}

	public static double showMethodThree(int a, int b, int c) {
		double d = b * b - 4.0 * a * c;
		double radiOne = (-b + Math.pow(d, 0.5)) / (2.0 * a);
		return radiOne;
	}
	
}
