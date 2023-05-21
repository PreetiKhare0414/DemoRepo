package javaOOPs;

public class Encapsulation3 {
	
	String name;
	int a;
	final int b=5;
	
	public void setName(String preeti)
	{
		this.name=preeti;
		this.a=2;
		System.out.println(a);
		System.out.println(b);
	}
	
	public Object getName()
	{
		return name;
	}

}
