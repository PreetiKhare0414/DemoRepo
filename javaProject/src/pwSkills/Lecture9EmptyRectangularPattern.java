package pwSkills;

public class Lecture9EmptyRectangularPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=3,c=6;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=6; j++)
			{
				if (i==1||i==r||j==1||j==c)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println("");
		}

	}

}
