package oops;

interface K {

	int a =10;
	
	void m1();
	
	
}
 public class Interface implements K {

	
	public void m1() {
		System.out.println(a);
		
	}
	 
	 
 public static void main (String[] args) {
	 
	 
	/*Interface it = new Interface();
	it.m1();*/
	 
	 K k = new Interface();
	 k.m1();
	 
	 
 }}