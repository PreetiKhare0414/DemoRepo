package homework;

public class EvenOddNumberArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even count: " +a[i]);
				
			}
			else
			{
				System.out.println("Odd count: " +a[i]);
				
			}
			
		}
		
		
	}

}
