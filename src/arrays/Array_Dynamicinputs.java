package arrays;

import java.util.Scanner;

public class Array_Dynamicinputs {

	public static void main(String[] args) {
		
		
		
		int [] a= new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter values");
		
		
		for (int i=0;i<a.length; i++) {
			
			
		a[i]=sc.nextInt();
			
		}
		for(int a1:a) {
			
			System.out.println(a1);
		}
	}

}
