package controlStatements;

public class Loopstatements {

	public static void main(String[] args) {
	
	whileloop ();	
	dowhile();	
	forloop();	
	}

	private static void forloop() {
		// TODO Auto-generated method stub
		
	
			for(int i =10; i>=1; i--) {
			System.out.println(i);		
		
		
			}
		
	}

	private static void dowhile() {
		// TODO Auto-generated method stub
		
		int i=1;
		   do {
			   System.out.println(i); 
		   i++;
		   }
		   while (i<=10);	
		
		
		
		
	}

	private static void whileloop() {
		// TODO Auto-generated method stub
		
		int i=10;
		while(i>=1) {
			System.out.println(i);
		
			
			i--;
		}
		

		
		
		}

		
		
		
		
		
	}

	
	
	
	
	
	
	
	

