package java_Programs;

public class Sum_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a=123456789;
	
	int sum= 0;
	
	
	while (a>0) {
		
		sum=sum+a%10;
		a= a/10;
		
	}
		System.out.println(sum);
		
		
		
		
	}

}
