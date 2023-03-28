package oops;

public class ThisKeyword {
	
	
	int a ;
	int b;
	
	void values ( int a, int b) {
		
		this.a = a;
		this.b= b;
		
	}
	
	void printvalues() {
		System.out.println(a);
		System.out.println(b);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ThisKeyword tk = new ThisKeyword();
	tk.values(500, 600);
	tk.printvalues();
		
		
		
	}

}
