package java_Programs;

import java.util.Scanner;

public class Palindrome_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter no");
		int a = sc.nextInt();*/
		
		
		
		
		int a= 12321;
		int org_a = a;
		int rev= 0;
		
		
		while (a!=0)  {
			
			
			rev=rev*10+a%10;
			
			a=a/10;
		
			
		}
		
		System.out.println(rev);
		
		if (org_a==rev) {
			System.out.println("palindrome number");
		}
		
		else {
			
			System.out.println("not a palindrome number");
		}
		
		
		
		
		
		
		
	}

}
