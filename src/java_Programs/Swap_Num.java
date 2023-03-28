package java_Programs;

public class Swap_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;
		int b = 20;
		
		
		System.out.println("Before swap   "+ a+"  "+b);
	
		/*int t = a;
		 a = b;
		 b = t;
		
		 System.out.println("After swap   "+ a+"  "+b);*/
		
		
		/*a= a*b;
		b= a/b;
		a= a/b;
		
		System.out.println("After swap   "+ a+"  "+b);*/
		
		
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After swap   "+ a+"  "+b);
		
		
		
		
	}

}
