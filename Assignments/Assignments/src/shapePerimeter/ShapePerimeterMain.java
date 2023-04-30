package shapePerimeter;

public class ShapePerimeterMain {

	public static void main(String[] args) {
		int radius = 5;

		double circleArea = 2 * Math.PI * radius;
		System.out.println("Perimeter of a circle is: " + String.format("%.2f", circleArea));
		
		int triSideA = 4;
		int triSideB = 7;
		int triSideC = 7;
		
		double triPerimeter = triSideA + triSideB + triSideC;
		System.out.println("Perimeter of a triangle is: " + triPerimeter);
		
		int rectLength = 4;
		int rectWidth = 6;
		if(rectLength == rectWidth) {
			System.out.println("This is not a rectangle, it is a square");
		} else {
			int rectPerimeter = (rectLength * 2) + (rectWidth * 2);
		System.out.println("Perimeter of a rectangle is: " + rectPerimeter);
		}
	}

}
