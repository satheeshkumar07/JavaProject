package oops;


interface ABC {
	
	int x = 100;
	void m1();
	
}

interface XYZ {
	
	int y = 200;
	void m2();

}


public class MultipleInheritence implements ABC,XYZ {
	
	
	public void m2() {
		System.out.println(x);
		
	}

	
	public void m1() {
		
		System.out.println(y);
	}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritence mt = new MultipleInheritence ();
		
		mt.m1();
		mt.m2();
		
		
		
		
		
		
		
		
		
		
		
	}	

}
