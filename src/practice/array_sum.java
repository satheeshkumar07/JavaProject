package practice;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num []= {25,33,54,64,85};
		
	int 	sum =0;
		
		
	/*	for (int i=num.length-1; i>=0;i-- ) {
			
			sum = sum+num[i];
			
			
		}
		
		System.out.println(sum);*/
		
		
		
		for (int k:num)
		{
			
			sum= sum+k;
			
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
