package oops;



class Animal {
	
	String color = "Black";
	
   void display() {
	   
	   
	   System.out.println(color);
   }
   
   void eating() {
	   
	   System.out.println("Animal eating ........");
   }
   
   Animal() {
	   System.out.println("animal is created");
   }
   
   
   
   
}

class Dog extends Animal {
	
	String color = "White";
	
   void display() {
	   
	   System.out.println(color); 
	   System.out.println(super.color);
   }
   
   void eating () {
	   
	
	System.out.println("Dog eating........");   
	  super.eating(); 
   }
  
   Dog() {
	   
	   super();
	  System.out.println("Dog is created"); 
	   
   }
   
   
   
   
}



public class SuperKeyword {

	public static void main(String[] args) {
	
		Dog d = new Dog();
		d.display();
		d.eating();
		
		
		
		
	}

}
