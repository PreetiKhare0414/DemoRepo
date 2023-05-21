package javaSelenium;

public class Object_Creation {
	
	private char[] x1;

	//int x;  // Create a class attribute
	//Create a constructor
	public Object_Creation(int x ,String y) {
		 int x1;  // Set the initial value for the class attribute x
		 String n;
		 
		}
	
	 // Static method
	  static void myStaticMethod() { 
	    System.out.println("Static methods can be called without creating objects");
	    
	    
	    
	  }
	// Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects " );
	  }

	public static void main(String[] args) {
		Object_Creation myObj = new Object_Creation(100,"dfgh"); // Create an object of class Main (This will call the constructor)
		 System.out.println(myObj.x1); // Print the value of x
		myObj.myStaticMethod();
		myObj.myPublicMethod();

	}

}
