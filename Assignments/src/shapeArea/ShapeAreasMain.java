package shapeArea;

public class ShapeAreasMain {

	public static void main(String[] args) {
		int radius = 5;

		double circleArea = Math.PI * (radius * radius);
		System.out.println("Area of a circle is: " + String.format("%.2f", circleArea));
		
		int triBase = 4;
		int triHeight = 7;
		
		double triArea = 0.5 * triBase * triHeight;
		System.out.println("Area of a triangle is: " + triArea);
		
		int rectLength = 4;
		int rectWidth = 6;
		if(rectLength == rectWidth) {
			System.out.println("This is not a rectangle, it is a square");
		} else {
			int rectArea = rectLength * rectWidth;
		System.out.println("Area of a rectangle is: " + rectArea);
		}
	}

}
