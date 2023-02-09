package homework;

public class Factorial {

	public static void main(String[] args) {
		
		int a=5;
		int fact=1;
		
		for(int i=a; i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factoria of number:" +fact);
	}

}
