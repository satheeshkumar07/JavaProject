package practice;

public class Object {

	
	
	String name;
	int age;
	int salary;
	String address;
	char gender;
	
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(address);
		System.out.println(gender);
			
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object ob1 = new Object();
		/*System.out.println(ob1.name);
		System.out.println(ob1.age);
		System.out.println(ob1.salary);
		System.out.println(ob1.address);
		System.out.println(ob1.gender);*/
		ob1.display();
		
		
		Object ob2 = new Object();
		ob2.name = "satheesh";
		ob2.age = 30;
		ob2.salary = 30000;
		ob2.address = "Hyderabad";
		ob2.gender = 'm';
		ob2.display();
		
		
		String a = "apple";
		String b = "apple";
		String c = "new";
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a.equals(c));
		
	}

}



  
  




