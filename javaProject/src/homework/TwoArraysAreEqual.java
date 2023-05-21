package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoArraysAreEqual {

	public static void main(String[] args) {
		int a1[]= {1,4,3,6,8,2};
		int a2[]= {1,4,3,6,8,2};
		/*boolean status=Arrays.equals(a1,a2);
		if(status==true)
		{
			
			System.out.println("Array are Equal");
		}
			else
			{
				System.out.println("Array are not Equal");	
			}*/
		if(a1.length==a2.length)
		{
			for(int i=0; i<a1.length-1;i++)
			{
				if(a1[i]!=a2[i])
				{
					System.out.println("Arrays are not equal");
					break;
				}	
				else
				{
					System.out.println("Arrays are Equal");
				}
			}
		}
		
		}
	}

			


