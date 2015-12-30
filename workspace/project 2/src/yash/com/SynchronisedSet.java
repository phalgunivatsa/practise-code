package yash.com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronisedSet {

	 
	  public static void main(String[] args) {
	 
	  Set set = new HashSet();
	     
	  
	  set.add("Phalguni");
	  set.add("Honey");
	  set.add("Aadya");
	  set.add("Kushagra");
	     
	  Set setsync = Collections.synchronizedSet(set);
	    
	  System.out.println("Synchronized set is :"+setsync);
	 }
	}



