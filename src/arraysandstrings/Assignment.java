package arraysandstrings;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int a[] = new int []{10,20,33,40,59};
		//int sum =0;
		
		
		/*for (int i:a) {
		
			
			sum = sum+i;
			
		}
		
		System.out.println(sum);*/
		
		/*for (int i= 0; i<a.length; i++)
		{
			sum= sum+a[i];
		
			
			
		}
		
		System.out.println(sum);*/
		
		
		/*for (int i=0; i<a.length;i++) {
			
		if (a[i]%2==0) {
			
			System.out.println(a[i] +" is Even number");
		}
			
		else {
			System.out.println(a[i] +"is odd number");
		}
			
		}*/
		
		
	/*	int a[][] = new int [][] {{10,23,24} ,{22,33,54},{19,44,52}};
		
		int b [][]= new int [][] {{22,33,41},{22,25,36},{22,55,61}};
		
		int c[][]= new int [3][3];
		
		for (int i=0;i<a.length;i++) {
			
			for (int j =0;j<a.length;j++)
			{
				
				c[i][j] = a[i][j]+b[i][j];
				
				System.out.print(c[i][j] +"  ");
				//System.out.println(a[i] [j]);
				//System.out.println(b[i] [j]);
			}
			
			System.out.println();
			*/
			
		
		
	  int a[] = new int []{10,20,33,40,59};
		
		
		int max=a[0];
		
		for (int i =0;i<a.length;i++) 
		{
			
			if(a[i]>max) {
				
				max= a[i];	
				
			}
			
		}
		
		System.out.println(max);
		
		
		
		
	}

}
