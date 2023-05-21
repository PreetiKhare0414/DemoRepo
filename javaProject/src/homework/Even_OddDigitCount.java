package homework;

public class Even_OddDigitCount {

	public static void main(String[] args) {
		int num=12345;
		int even=0;
		int odd=0;
		while(num!=0)
		{
			int rem =num%10;
			num=num/10;
			
			if (rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Count of even:" +even);
		System.out.println("Count of odd:" +odd);	
	}

}
