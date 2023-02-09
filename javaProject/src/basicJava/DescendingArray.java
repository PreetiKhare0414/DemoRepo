http://172.30.15.237:32017package basicJava;

//import java.util.Arrays;
//import java.util.Collections;

public class DescendingArray {

	public static void main(String[] args) {
		//1st Method
	/*	Integer arr[]= {3,7,5,2,4,23};
		//Arrays.sort(arr,Collections.reverseOrder());

		System.out.println(Arrays.toString(arr));*/
		
		String name="Amit";
		
		String rev= " ";
		int a = name.length();// size of strin
				
				for(int i =a-1; i>=0;i--);
				{
				
				char ch=name.charAt(i);
					rev= rev+ch;
					
					
				}
				System.out.println(rev);
		
		
	}

}
