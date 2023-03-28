package oops;

public class MethodOverloading {
	
	
	
	
	void add (int a , int b ) {
		
	System.out.println(a+b);	
		
		
	}
	
	void add (int a , int b , int c) {
		
		System.out.println(a+b+c);	
			
			
		}
	
	
	void add (int a , double b ) {
		
		System.out.println(a+b);	
			
			
		}
	
	
	
	void add (double a , int b ) {
		
		System.out.println(a+b);	
			
			
		}
	
	
	void add (int a , int b, double c ) {
		
		System.out.println(a+b+c);	
			
			
		}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();
		
		mo.add(100, 200);
		mo.add(55, 60);
		mo.add(59, 155, 166);
		
		
	}

}
