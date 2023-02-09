package homework;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=2;
		int temp=0;
		
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			temp=temp+1;
			break;
		}
		
	}
	if(temp>0)
	{
		System.out.println(" Not Prime");
	}
	else
	{
		System.out.println("Prime");
	}

	}

}
