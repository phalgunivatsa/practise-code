package yash.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SynchronisedList {
	  public static void main(String[] args) {
		  ArrayList arraylist = new ArrayList();
	      arraylist.add("Zara");
	      arraylist.add("Mahnaz");
	      arraylist.add("Ayan");
	      System.out.println(arraylist);
	      
	      List arraylistsync = Collections.synchronizedList(arraylist);
	      System.out.println("Synchronised List is:" +arraylistsync);
		  
	 }

}
