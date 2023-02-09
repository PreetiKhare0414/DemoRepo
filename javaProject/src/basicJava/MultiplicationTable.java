package basicJava;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n=5;
		/*for(int i=1;i<=10; i++)
		{
			System.out.printf("%d X %d = %d\n", n,i, n*1);
		}*/
		int sum =0;
				for(int i=1;i<=10; i++)
				{
					sum+= n*i;
				}
		System.out.println(sum);

	}

}
