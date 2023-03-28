package strings;

public class StringBuffer {

	public static void main(String[] args) {
		
		String str = "satheesh";
		
		String st = "kumar";
		
		
		StringBuilder sb = new StringBuilder(str);
		sb.append(st);
		
		
		
		System.out.println(sb);
		/*sb.delete(1, 2);
		System.out.println(sb);
		
	
		System.out.println(sb.deleteCharAt(1));*/
		
		//System.out.println(sb.reverse());
		
	//	System.out.println(sb.insert(1,"hi"));
		
		System.out.println(sb.replace(0,3,"oy"));
		
		
		
		
		
		
		
		
		
		
		

	}

}
