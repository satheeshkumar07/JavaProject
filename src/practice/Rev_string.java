package practice;

public class Rev_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	String s = "satheesh";
	
	String rev= "";
	
	//int len = s.length();
	
	
	for(int i=s.length()-1; i>=0;i--) {
		
		rev=rev+s.charAt(i);
		
		
		
	}
		
	System.out.println(rev);
		
		
		
		
	/*	StringBuffer sb= new StringBuffer(s);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
		
		StringBuilder sbl= new StringBuilder();
		sbl.append(s);
		StringBuilder rev2 = sbl.reverse();
		System.out.println(rev2);*/
		
		
		
		
		
	}

}
