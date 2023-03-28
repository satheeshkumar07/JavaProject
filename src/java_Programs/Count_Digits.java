package java_Programs;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int num = 1234567;
		//int count =0;
		int Even_count = 0;
		int Odd_count = 0;
		
		/*while (num>0) {
			
			num = num/10;
			count++;
			
		}
		
		System.out.println(count);*/
		
		
          while (num>0) {
			
			int rem = num%10;
			
			if(rem%2==0) {
			
			Even_count++;
			}
			else 
			{
				Odd_count++;
			}
			num = num/10;
			}
		
		System.out.println(Even_count);
		System.out.println(Odd_count);
		
		
		
		
		
		
		
	}

}
