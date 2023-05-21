package homework;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=4536;
		int rev=0;
		while(a!=0)
		{
			rev=a%10+rev*10;
			a=a/10;
		}

	}

}
