package homework;

public class PalindromeString {

	public static void main(String[] args) {
		String str="aba";
		String org_str =str;
		String rev=" ";
		int len= str.length();
		
		for(int i=len-1; i>=0;i--)
		{
			/*char[] ch=str.toCharArray();
			rev=rev+ch[i];*/
			
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		
		
		if (org_str.equals(rev))
		
			{
				System.out.println("Palindrome string");
			}
			else
			{
				System.out.println("Not Palindrome");
			}
			
		}
		

	}


