package cylinderVolume;

public class CylinderVolume {

	public static void main(String[] args) {
		int cylRadius = 4;
		int cylHeight = 6;
		double cylVolume = Math.PI * (cylRadius * cylRadius) * cylHeight;
		
		System.out.println("Volume of a cylinder is: " + String.format("%.2f", cylVolume));
	} 

}
