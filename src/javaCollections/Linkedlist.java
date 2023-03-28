package javaCollections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LinkedList l = new LinkedList();
		
		l.add("Rohit");
		l.add("virat");
		l.add("surya");
		l.add("pant");
		l.add(null);
		l.add(null);
		
		
		System.out.println(l);
		
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeLast();
		System.out.println(l);
		
		l.addFirst("hardik");
		
		System.out.println(l);
		
		
		
		
	}

}
