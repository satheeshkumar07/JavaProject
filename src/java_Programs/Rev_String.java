package java_Programs;

public class Rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s = "satheesh";
		
		String rev="";
		
		
		/*int len = s.length();
		
		
		for (int i=len-1;i>=0;i--) {
			
			
			rev= rev+s.charAt(i);
			
			//System.out.println(rev);	
		}
		
		System.out.println(rev);*/
		
		
		/*char a[] = s.toCharArray();
		int len = s.length();
		
		for (int i=len-1; i>=0; i--) {
			
			rev = rev+a[i];
			
			
		}
		
		System.out.println(rev);*/
		
		
		/*StringBuffer sb = new StringBuffer(s);
		//StringBuffer sbrev = sb.reverse();
		//System.out.println(sbrev);
		System.out.println(sb.reverse());
		*/
		
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(s);
		System.out.println(sbl.reverse());
		
		
		
		
		
		
	}

}
