package arrays;

public class Array_copytoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int a[] = {10,20,30,40,50};
		
		int b[]= new int[5];
		
		
		System.arraycopy(a, 2, b, 0, 3);
		
		for(int c:b) {
			
			System.out.println(c);
		}*/
		
		
        int a[] = {10,20,30,40,50};
      
		
		int b[]= java.util.Arrays.copyOfRange(a, 1, 5);
		
		
		
		for(int c:b) {
			
			System.out.println(c);
		}
		
		System.out.println(a.getClass().getName());
		
		
		
		

	}

}
