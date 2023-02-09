package javaOOPs;

public class AbstractionScooter extends AbstractionVehicle{

	void start()
	{
		System.out.println("Scooter starts with kick");

	}
	public static void main(String[] args) {//abstract class cannot be instanti

		AbstractionCar ac = new AbstractionCar();
		ac.start();
		
		AbstractionScooter s = new AbstractionScooter();
		s.start();
}
}
