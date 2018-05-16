package tv;

public class SamTV implements TV{

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("Sam volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Sam volume down");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Sam TV on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Sam TV off");
	}
	
}