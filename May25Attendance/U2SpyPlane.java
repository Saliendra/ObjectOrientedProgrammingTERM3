package Inherit;

public class U2SpyPlane extends Vehicle{
	
	int wingsSpan = 348;
	
	void Fly() {
		System.out.println("You are now flying");
	}
	
	@Override
	void Stop() {
		super.Stop();
	}

}
