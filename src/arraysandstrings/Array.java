package arraysandstrings;

import strings.Stringmethods;

public class Array {

	public static void main(Stringmethods[] args) {
		// TODO Auto-generated method stub

		
		
	/*int a[] = new int [5];
		
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		//int a[] = {10,20,30,40,50};
		
		
		
		System.out.println("size of array is  " + a.length);
		
		
		/*for (int i=0;i<a.length; i++) {
			
		System.out.println(a[i]);	
			
		}
		
		
		
		for (int i:a) {
			
			System.out.println(i);
		}*/
		
	
		//int a[][]= new int [3][2];
		
		int a[][] = {{100,200} ,{300,400} ,{500,600}};
		
		a[0][0] = 100;
		a[0][1]  = 200;
		
	    a[1][0] =300;
		a[1][1] =400;

		
		a[2][0]=500;
		a[2][1]=600;
		
		
		System.out.println("no of rows   "+ a.length);
		System.out.println("no of cols   " +a[0].length);
		
		
	/*	for (int i=0; i<a.length; i++) {
			
			for (int j = 0; j<a[i].length; j++) {
				
				System.out.println(a[i][j]);
				
			}
			
		}*/
		
		for ( int r[]:a) {
			
			
			for (int i:r) {
				System.out.println(i);
		}
			
			
			
		
		
		
		
		}
	}
}


