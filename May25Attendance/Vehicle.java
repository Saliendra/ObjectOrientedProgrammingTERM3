package Inherit;

public class Vehicle {
	
	int ToyotaSpeed = 70;
	String ToyotaColor = "Red";
	String ToyotaPrice = "$16,500";
	
	int PlaneSpeed = 800;
	String PlaneColor = "White";
	String PlanePrice = "$65,899";
	
	int YachtSpeed = 40;
	String YachtColor = "Blue";
	String YachtPrice = "$80,000";
	String Mainsail = "Green";
	
	
	
	void Stop() {
		System.out.println("Your vehicle have stopped");
	}
	
	public static void main(String[] args) {
		
				ToyotaVIOS Car = new ToyotaVIOS();
				
				System.out.println("Toyota-VIOS:");
				System.out.println("Speed: " + Car.ToyotaSpeed + " MPH");
				System.out.println("Color: " + Car.ToyotaColor);
				System.out.println("Price: " + Car.ToyotaPrice);
				System.out.println("Tire Type: " + Car.tireType);
				
				System.out.println();
				Car.Drive();
				Car.Stop();
				
				System.out.println();
				System.out.println("===========================================");
				
				U2SpyPlane Plane = new U2SpyPlane();
				
				System.out.println("U2 Spy Plane:");
				System.out.println("Speed: " + Plane.PlaneSpeed + " MPH");
				System.out.println("Color: " + Plane.PlaneColor);
				System.out.println("Price: " + Plane.PlanePrice);
				System.out.println("Wing Span: " + Plane.wingsSpan);
				
				System.out.println();
				Plane.Fly();
				Plane.Stop();
				
				System.out.println();
				System.out.println("===========================================");
				
				FandangoYacht Yacht = new FandangoYacht();
				System.out.println("Fandango Yacht:");
				System.out.println("Speed: " + Yacht.YachtSpeed + " MPH");
				System.out.println("Color: " + Yacht.YachtColor);
				System.out.println("Price: " + Yacht.YachtPrice);
				System.out.println("Main Sail Color: " + Yacht.Mainsail);
				
				System.out.println();
				Yacht.Float();
				Yacht.Stop();
				
		
		

	}

}
