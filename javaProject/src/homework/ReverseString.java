package homework;

public class ReverseString {

public static  void main (String[]agrs) {
	String a = "preeti saxena";
	String rev=" ";
	int len =a.length();
	
	for(int i=len-1; i>=0;i--)
	{
		char ch= a.charAt(i);
		rev=rev+ch;
	}
	System.out.println(rev);
	
	
	
	
	//Using Character Array
	
		/*{
			for(int i=len-1;i>=0;i--)
			{
				char[] ch=a.toCharArray();
				rev=rev+ch[i];
				
			}
			System.out.println(rev);
		}*/
		
		//Using String Buffer class
		
		/*StringBuffer sb =new StringBuffer(a);
		System.out.println(sb.reverse());*/
	
	

}
}