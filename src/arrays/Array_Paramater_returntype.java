package arrays;

public class Array_Paramater_returntype {
	
	
	
	static void m1 (Object [] a) {
		
	for(Object a1:a) {
		
		System.out.println(a1);
	}
		
		
		
	}
	
	static Object[]  m2() {
		
		return new Object[] {101,102,"kumar",104};
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
	m1(new Object [] {10,'s',30,40,"satheesh",70,80});	
		
	Object []x =m2();	
	for(Object x1:x) {
		
		System.out.println(x1);
	}

	}

}
