package basicJava;
import java.util.Scanner;
public class Factorial_While_For {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int fact=1;
		for(int i=2;i<=x;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
		
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int n=5;
	 int  i=1;
	 int factorial =1;
	 while(i<=n)
	 {
		 factorial *= i;
		 i++;
	 }
	 System.out.println(factorial);
*/

