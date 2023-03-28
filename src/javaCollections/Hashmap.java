package javaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
    //HashMap <Integer,String> hm = new HashMap <Integer,String>();
   
	HashMap hm = new HashMap();	
		
		
    hm.put(101, "pawan");
    hm.put(102, "kalyan");
    hm.put(103, "Ram");
    hm.put(104, "charan");
		
	System.out.println(hm);	
		
	
	//hm.remove(103);
	
	System.out.println(hm);
	
	//System.out.println(hm.get(103));
	
	
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	
	System.out.println(hm.entrySet());
	
	
	for(Object i : hm.keySet())
	{
		
		System.out.println(i);
	}
	for(Object i : hm.values())
	{
		
		System.out.println(i);
	}
	for(Object i : hm.keySet())
	{
		
		System.out.println(i +"   "+ hm.get(i));
	
	}
	
    Set s = hm.entrySet();
    
    Iterator it = s.iterator();
    while (it.hasNext())
    {
    Map.Entry entry = (Entry) it.next();	
    
    System.out.println(entry.getKey()+  "  "+ entry.getValue());
    }
    
  
    
	
	
   /*   for (Map.Entry m:hm.entrySet())
	{
		
		System.out.println(m.getKey()+"    " + m.getValue());
		
	}*/
	
	
	}

	}
