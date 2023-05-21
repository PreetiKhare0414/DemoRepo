package homework;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		int a = 74396;
		int count=0;
		
		while(a!=0)
		{
			
					
			a=a/10;
			count++;
			
		}
		System.out.println("Number of Digits in a number:" +count);
		
	}

}
