package java_Programs;

public class Prime_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 17;
		
		int count = 0;
		
		
		if ( a>1){
			
			for ( int i=1; i<=a; i++) {
				
				if (a%i==0) 
					
					count++;
				
			}
					if(count ==2) {
						
						System.out.println("prime number");
						}
					
				
						
						else {
						System.out.println("not a prime number");	
							
							
						
					
				}
			}
			
			
		
		
		else {
			
			System.out.println("not prime number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
