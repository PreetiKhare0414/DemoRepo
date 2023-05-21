package javaOnlineTraining_30june_batch;



public class Armstrong_Number1 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int n=sc.nextInt();
		
		int n=371;
		
		int  sum=0;
	while(n==0)
	{
		
		int x=n%10;
		sum=sum+x^3;
		
		
	}
	if (n==sum)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
}
}
