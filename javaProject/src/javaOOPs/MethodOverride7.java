package javaOOPs;

public class MethodOverride7 extends MethodOverride6{
	public void walk() {
		System.out.println("I am walking");
		
	}
	public static void main(String[]args)
	{
		MethodOverride7 mo7= new MethodOverride7();
		
		mo7.angry();
		mo7.eat();
		mo7.walk();
		
	}

}
