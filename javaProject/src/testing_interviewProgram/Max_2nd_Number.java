package testing_interviewProgram;

public class Max_2nd_Number {

	public static void main(String[] args) {
		int [] arr= { 5,7,3,9,12};
		int temp=0;
		for (int i=0; i<arr.length-1;i++)
		{
			if (arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]= temp;
			}
			System.out.println(arr[i]);
			}

	}

}
