package javaOOPs;

public class AbstractionCar  extends AbstractionVehicle{

	void start()
	{
		System.out.println("car starts with key");

	}
	public static void main(String[] args) {
		
		AbstractionCar ac = new AbstractionCar();
		ac.start();
		
		AbstractionScooter s = new AbstractionScooter();
		s.start();
	}
	
}
