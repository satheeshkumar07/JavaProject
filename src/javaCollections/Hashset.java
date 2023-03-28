package javaCollections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	HashSet hs = new HashSet();
	
	hs.add("rohith");
	hs.add("virat");
	hs.add("surya");
	hs.add("pant");
	hs.add(null);
	hs.add(null);
	hs.add("surya");
	hs.add(null);
	
		System.out.println(hs);
		
		HashSet set1 = new HashSet ();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		
		System.out.println("set1" + set1);
		HashSet set2= new HashSet();
		
		set2.add(10);
		set2.add(20);
		set2.add(60);
		set2.add(70);
		System.out.println("set2" + set2);
		
		
        set1.addAll(set2);
		
		System.out.println("union " + set1);
		
         set1.retainAll(set2);
		
		System.out.println("intersection " + set1);	
		
       set1.removeAll(set2);
		
		System.out.println("diff " + set1);	
		
          set1.containsAll(set2);
		
		System.out.println("subset" + set1);	
		
	}

}
