package javaOOPs;

public class MethodOverloading7 {
	
	public void sum(int a, long b) {
		System.out.println(a+b);
	}	
		public void sum(long a, int b) {
			System.out.println(a+b);
	}

		public static void main(String[] args) {
			MethodOverloading7 mo7 = new MethodOverloading7();
			mo7.sum(5, 7);//Ambiguity Issue
		}
}
