package exceptionHandling;

public class Exceptions {

	public static void main(String[] args) {
		
   
    System.out.println("program is started");	
    System.out.println("program is in progress");
    
   // int a= 10;
   // System.out.println(a/0);
    
    
    //String s = null;
   // s.length();
    
    
  // int x[] = new int[5];
   // x [10]= 100;
    
  //  String k = "123";
    
    try 
    {
   // int i = Integer.parseInt(k);
    }
    catch (Exception e )
    {
    	
    System.out.println("Entered catch block");	
    }
    
    finally 
    {
    	System.out.println("Entered into finally block");
    }
    
    
    System.out.println("program is completed");	
    System.out.println("program is exited");
    
    
	}

}
