package arrays;

public class Array_Programs {
	
	
	
	static void sum_array() {
	
		int a[] = {10,20,30,40,50};
		
		int sum =0;
		
		/*for(int i=0; i<a.length; i++) {
			
			sum = sum+a[i];
		}
		System.out.println(sum);*/
		
		
		for(int a1 :a) {
			
			sum=sum+a1;
		}
		System.out.println(sum);
	}
	
	static void min_array() {
		int a[] = {10,20,30,40,50};	
		int min= a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if (a[i]<min) {
				
				min = a[i];			
			}			
		}
		System.out.println(min);
			
	}
	static void max_array() {
		int a[] = {10,20,30,40,50};	
		int max= a[0];
		
		for(int i=0; i<a.length;i++) {
			
			if (a[i]>max) {
				
				max = a[i];			
			}			
		}
		System.out.println(max);
			
	}
	
	
	
	
	

	public static void main(String[] args) {
		
	sum_array();	
	min_array();	
	max_array();	
	

	}

}
