package practice;

public class swap__num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a=10;
	int b=20;
	
	/*int t =a;
	a=b;
	b=t;*/
		
System.out.println("before swap "+a);	
System.out.println("before swap "+b);
		
		
	/*a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swap " +a);	
	System.out.println("After swap "+b);	*/
		
	a= a*b;
	b=a/b;
	a=a/b;
	System.out.println("after swap " +a);	
	System.out.println("After swap "+b);		
		
	}

}
