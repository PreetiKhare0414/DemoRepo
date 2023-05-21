package basicJava;



public class PrimeNumber {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();*/
		int x=8;
		boolean a= false;
	for(int i=2; i<x;i++)
	{
		if(x%i==0)
		{
			a=true;
			break;
		}
	
	}
	 if(a==false)
	 {
		 System.out.println("Prime");
	 }
	 else
	 {
		 System.out.println("Not Prime");
	 }

	}

}
