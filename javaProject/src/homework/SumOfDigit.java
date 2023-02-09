package homework;

public class SumOfDigit {

	public static void main(String[] args) {
		int a=1234;
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			a=a/10;
			sum=sum+rem;
		}
		System.out.println("Sum Of Digit:" +sum);
	}

}
