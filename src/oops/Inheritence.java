package oops;

 class A {

	
	
int a;
void print () 
{
	
	System.out.println(a);
	
}
	
}	
class B extends A {
	
	int b;
	void print () {
		
	System.out.println(b);	
		
	}


}

/*class C extends B {
	int c;
	void show() {
	
		
		System.out.println(c);
		
	}
	
	
}*/

class C extends B {
	int c;
	void print() {
	
		
		System.out.println(c);
		
	}

}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*A aobj = new A();
		
		aobj.a= 100;
		aobj.display();
			
		B bobj = new B();
		
		bobj.a= 10;
		bobj.b= 200;
		bobj.print();	
		bobj.display();*/
		
	/*	C cobj = new C ();
		
		cobj.a = 10;
		cobj.b = 20;
		cobj.c = 30;
		cobj.display();
		cobj.print();
		cobj.show();*/
	
		
		
    /* B bobj = new B();
		
		bobj.a= 10;
		bobj.b= 200;
		bobj.print();	
		//bobj.display();*/
		
		
		
		
      C cobj = new C ();
		
		cobj.a = 10;
		cobj.b = 40;
		cobj.c = 30;
	//	cobj.display();	
		cobj.print();
		//cobj.show();
		
		
		
		
		
		
		
	}

}
