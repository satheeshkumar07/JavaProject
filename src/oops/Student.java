package oops;

public class Student {
	
	int a= 10;
	int b = 20;
	
	
	
	/*void sum () {
		
		System.out.println(a+b);
	}*/
	
	/*int  sum () {
		
	return a+b;
	}*/
	
	
   /* void sum (int x, int y) {
		
		System.out.println(x+y);
	
    }*/
	
    int  sum (int k , int l) {
		
    	return a+b;
	
	
    }

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student ();
		//s.sum();
		//System.out.println(s.sum());
		
		//s.sum(10, 20);
		
		System.out.println(s.sum(10, 20));
	}

}
