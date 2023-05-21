package pwSkills;

import java.util.Scanner;

public class Lecture8_CountDigitOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Scanner sc =new Scanner(System.in);
		//int num = sc.nextInt();
		int num=1234;
		int count=0;
		while(num>0)
		{
	
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
