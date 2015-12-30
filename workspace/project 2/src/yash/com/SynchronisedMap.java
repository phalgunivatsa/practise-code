package yash.com;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SynchronisedMap {

	 
	  public static void main(String[] args) {
	 
	  Map hmap = new HashMap();
	  hmap.put(1,"Phalguni");
	  hmap.put(2,"Honey");
	  hmap.put(3,"Aadya");
	  hmap.put(4,"Kushagra");
	     
	  Map hmapsync = Collections.synchronizedMap(hmap);
	    
	  System.out.println("Synchronized map is :"+hmapsync);
	 }
	}



