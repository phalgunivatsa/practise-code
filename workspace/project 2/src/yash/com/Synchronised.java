package yash.com;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Synchronised {

	 
	  public static void main(String[] args) {
	 
	  Set set = new HashSet();
	     
	  // populate the set
	  set.add("Phalguni");
	  set.add("Honey");
	  set.add("Aadya");
	  set.add("Kushagra");
	     
	  Set setsync = Collections.synchronizedSet(set);
	    
	  System.out.println("Synchronized set is :"+setsync);
	 }
	}



