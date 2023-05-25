package Inherit;

public class FandangoYacht extends Vehicle{
	
	 String Mainsail = "Green";

	
	void Float() {
		System.out.println("You are now Sailing");
	}
	@Override
	void Stop() {
		super.Stop();
	}
}
