package controlStatements;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*	int a = 10;
		
		
		if (a>0) {
			
			System.out.println("positive number");
		}
		
		else {
			
			System.out.println("negative number");
		}*/
		
		
	/*int a = 20;
	int b = 30;
	int c = 40;
		
	if (a>b&&a>c)	{
		
		System.out.println("a is greatest");
	}
	else if (b>a&&b>c) {
		
		System.out.println("b is greatest");
		
	}
	else 
		System.out.println("c is greatest");
		
		
	}*/

	
	
	/*int a = 5;
	
	
	for (int i = 0; i<=10; i++) {
		
		int res = a*i;
		
		System.out.println(a +"*" +i+ "="+ res);
		
		
		
	
		
	}
	
	*/
	
    String  s = "*****";
    int len = s.length();
    String res = "";
    
    
    
    for (int i=len-1;i>0; i-- ) {
    	
    	res= res+s.charAt(i);
    	System.out.println(res);
    	
    }
	
	
	int a=12345688;
	
	int count =0;
	
	while(a>0)
	{
		
		a = a/10;
		count++;
		
	}
	System.out.println(count);
	
	
	
	
	
	}	
	
	
	
	
	
	
	
}
