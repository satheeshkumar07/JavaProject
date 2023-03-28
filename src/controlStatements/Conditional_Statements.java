package controlStatements;

public class Conditional_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		if_else_Condition();
		nestedif();
		switchstmt();
		
	}
		private static void switchstmt() {
		
			 int day = 2;	
			
			
			switch(day) {
			
			case 1 : System.out.println("sunday");break;
			case 2 : System.out.println("monday");break;
			case 3 : System.out.println("tuesday");break;
			case 4 : System.out.println("wednesday");break;
			case 5 : System.out.println("thursday");break;
			case 6 : System.out.println("friday"); break;
			case 7 : System.out.println("saturday");break;
			
			
			}
			
			
			
			
			
			
			
			
			
	}
		private static void nestedif() {
          int day = 2;	
			
			if(day==1)
			{
				System.out.println("sunday");
		}
		
		else if (day==2)
		{
			System.out.println("monday");
		}	
				
		else if (day==3)
		{
			System.out.println("tuesday");
		}	
			
		else if (day==4)
		{
			System.out.println("wednesday");
		}		
			
		else if (day==5)
		{
			System.out.println("thursday");
		}		
			
		else  
		{
			System.out.println("invalid day");
		}		
			
			
			
			
			
	}
		public static void if_else_Condition()
		{
	int age = 60;	
		
		if(age>=65)
		{
			System.out.println("you are eligible for free ticket");
	}
	
	else
	{
		System.out.println("please pay ticket amount");
	}	
		
		
		
				
			
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		}		
		
		
		
	


