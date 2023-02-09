package pwSkills;

public class Lecture9_ReverseTrianglePattern {

	public static void main(String[] args) {
		int r=1;
		
		for(int i=6;i>=r;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
