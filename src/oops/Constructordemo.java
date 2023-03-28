package oops;

public class Constructordemo {
	
	
	
	int x;
	int y;
	
	
	Constructordemo(int a, int b) {
		
		x= a;
		y= b;
		
		
	}
	
	
	/*Constructordemo() {
		
		x=100;
		y=200;
		
	}*/
	
	void display () {
		
		System.out.println(x+y);
		
	}
	

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructordemo cd= new Constructordemo(500, 200);
		//Constructordemo cd= new Constructordemo();
		cd.display();
	}

}
