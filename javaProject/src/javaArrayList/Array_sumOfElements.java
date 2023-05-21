package javaArrayList;



public class Array_sumOfElements {
	
	
	public static void main(String [] args)
	{
		int []ages = {2,3,6};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum+= ages[i];
			
		}
		System.out.println(sum);
	}
	
	

//	public static void main(String[] args) {
//		
//		float []arr1= {2.1f,3.3f,1.2f,7.1f};
//		float sum =0.0f;
//		for (int i=0;i<arr1.length;i++)
//		{
//			sum+=arr1[i];
//			
//		}
//		System.out.printf("%f",sum);
//	}
	


}


/*import java.util.Scanner;

public class floata {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        float arr[]=new float[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextFloat();
        }
        float sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
        
        

    }
    
}*/

