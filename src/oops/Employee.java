package oops;

public class  Employee {
	
	
	int eid;
	String ename;
	double esal;
	int deptno;
	String ejob;


	
	Employee (int id, String name, double sal, int dpno, String job)
	{
		eid = id;
	    ename = name;
		 esal = sal;
		 deptno = dpno;
		 ejob = job;
			
	}
	
	
	

	void getvalues (int id, String name, double sal, int dpno, String job)
	{
		eid = id;
	    ename = name;
		 esal = sal;
		 deptno = dpno;
		 ejob = job;
		
		
	}
	
	
	

void display () {
	
System.out.println(eid);	
System.out.println(ename);	
System.out.println(deptno);
System.out.println(esal);
System.out.println(ejob);



}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Employee emp1 = new Employee(105, "kiran", 40000, 25, "marketing");
	/*emp1.eid= 101;
	emp1.ename="satheesh";
	emp1.esal= 50000;
	emp1.deptno = 10;
	emp1.ejob= "tester";*/
		
	
	
	//emp1.getvalues(102, "ashok", 30000, 20, "sales");
	emp1.display();	
		
		
	}
	
	

		
	
	
	
	
	
	
	}
	
	
	

	
	
	
	
	
	

