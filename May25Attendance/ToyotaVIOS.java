package Inherit;


public class ToyotaVIOS extends Vehicle {
	String tireType = "All Terrain Tires";
	
	 void Drive() {
		System.out.println("Your are now driving");
	 }
		@Override
		void Stop() {
			super.Stop();
	}
}
