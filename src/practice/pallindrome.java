package practice;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num =12321;
		
		int org_num=num;
		
		int rev=0;
		
		
		while(num>0) {
			
			rev= rev*10+num%10;
			
			num=num/10;
			
			
		}
		
		System.out.println(rev);
		
		
		
		if (org_num==rev)
		{
			
		System.out.println("palindrome num");	
			
		}
		
		else {
			
			System.out.println("not a palindrome number");
		}
		
		/*String str = "madam";
		String rev= "";
				
		String org_str= str;		
				
		
		
		
		for (int i=str.length()-1; i>=0; i--)
		{
			
		rev= rev+str.charAt(i);	
	
			
		}
		
		System.out.println(rev);
		if (org_str.equals(rev))
		{
		System.out.println("palindrome");	
			
		}
		
		
		else {
			
			System.out.println("not a palindrome");
		}*/
	}

}
