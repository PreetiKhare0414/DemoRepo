package javaArray;

import java.util.Scanner;

public class SumOfArray {
	
	public static void sumArray(int arr[]) {
		int n =arr.length;
		int sum=0;
		for(int i=0; i<n;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
	
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []arr1 = new int [n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] =sc.nextInt(i);
		}
		sumArray(arr1);

	}

}
