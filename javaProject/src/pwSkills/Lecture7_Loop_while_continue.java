package pwSkills;

public class Lecture7_Loop_while_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		
		while(num<50)
		{
			if (num%3==0)
			{
				num++;
				continue;
			}
			num++;
			System.out.println(num);
			
		}
		
	}

}
