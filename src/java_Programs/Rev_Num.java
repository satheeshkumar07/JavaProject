package java_Programs;

import java.util.Scanner;

public class Rev_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no : ");
		
		int num = sc.nextInt();
		
		
		
		//int a = 1234;
		
		
		/*int rev= 0;
		
		
		while(a !=0)  {
			
			rev= rev*10+a%10;
			a = a/10;
				
		}
		
		System.out.println(rev);*/
		
		
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(a));
		StringBuffer rev =sb.reverse();
		System.out.println(rev);*/
		
		
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
	}

}
