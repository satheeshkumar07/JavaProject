package java_Programs;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String s = sc.next();
		
		String rev= "";
		String org_s = s;
		
		int len = s.length();
		
		for (int i=len-1; i>=0;i--) {
			
			rev= rev+s.charAt(i);
			
			
		}
		System.out.println(rev);
		
		
		
		
		
		
		
		
	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
