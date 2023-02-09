package homework;

public class Y_SumOfDigitReturnSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7563;
		int rem=0,sum=0;
		int sum1=0;
		while(n>0);
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if(n>9)
		{
			
			rem=sum%10;
			sum1=sum1+rem;
			sum=sum/10;
		}
	
		System.out.println(sum1);
	}

}
