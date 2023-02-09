package javaOOPs;

public class OOPsAbstractScooter  extends OOPsAbstractVehicle {

	
	void start() {
		System.out.println("Start with Kick");
		
	}
	public static void main(String[] args)
	{

		OOPsAbstractVehicle s1 = new OOPsAbstractScooter();
		s1.start();
		OOPsAbstractVehicle c1 =new OOPsAbstractCar();
		c1.start();
	}
	

}
