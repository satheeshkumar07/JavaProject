package oops;


class A1 {
	
	void m1()
	{
	System.out.println("This is m1 method from A1 Class");	
	}
	
}

interface B1 {
	
	
	void m2 ();
}

interface B2 {
	
	
	void m3() ;
	
}



public class HybridInheritence extends A1 implements B1,B2 {
	
	
	

	@Override
	public void m3() {
		System.out.println("This is m2 method from B1 class");
		
	}

	@Override
	public void m2() {
		System.out.println("This is m3 method from B3 class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HybridInheritence hi = new HybridInheritence();
	    hi.m1();
	    hi.m2();
	    hi.m3();
	
	
	
	
	}	
}
