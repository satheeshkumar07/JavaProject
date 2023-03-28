package javaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		
		
		
		ArrayList list = new ArrayList();
		
		//ArrayList <Integer> list = new ArrayList <Integer>();
		
		//ArrayList <String> list = new ArrayList <String>();
		
		list.add("rohith");
		list.add("virat");
		list.add("surya");
		list.add("pant");
		list.add(null);
		list.add(null);
		list.add(50);
		
	
		
		
		//ArrayList list_dup = new ArrayList();
		
		
		
		//list_dup.addAll(list);
		
	System.out.println("Array list"+ list);
	//System.out.println("dup Array list"+ list_dup);
	
	
	/*list_dup.removeAll(list);
	System.out.println("after removing dup Array list"+ list_dup);
	
	System.out.println(list_dup);
	
		/*System.out.println(list.size());
		
		
		list.remove("virat");
		System.out.println("after removing array list "+list);
		
		System.out.println(list.size());
		
		/*list.add(2, "surya");
		list.add(3, 12345);
		
		System.out.println("after inserting "+list);	*/
		
		
		//System.out.println(list.get(2));
		//list.set(2, "jadeja");
		
		
		for(Object s :list) {
			
			
			System.out.println(s);
		}
			
     /*  for (int i=0; i<list.size();i++)
         {
        	 System.out.println(list.get(i));
        	 
        	 
        	 
         }*/
		
		/*Iterator it = list.iterator();
		
		while (it.hasNext())
		{
			
			System.out.println(it.next());
			
		}*/
		
		
		//System.out.println(list.contains("virat"));*/

		
		/*ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		
		ArrayList al2 = new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(60);
		
		//al.retainAll(al2);
		//al.containsAll(al2);
		al.addAll(al2);
		
		System.out.println(al);
		
		
		
		String s[] = {"sachin", "sehwag" ,"ganguly"};
		
		for (String e: s)
		System.out.println(e);
		
		ArrayList al = new ArrayList(Arrays.asList(s));
		System.out.println(al);
		
		
		*/
		
		
		
		
		
		
		
		
	}

}
