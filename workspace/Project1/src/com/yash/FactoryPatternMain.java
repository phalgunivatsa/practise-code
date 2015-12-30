package com.yash;

import java.util.Scanner;

class PersonalComputer implements InterfaceComputer{
	public PersonalComputer(){
		System.out.println("You have entered Personal Computer");
	}
		public void show(){
		System.out.println("Personal Computer");
	}
}

 class Laptop implements InterfaceComputer{
	public Laptop(){
		System.out.println("You have selected a laptop");
	}
	 public void show(){
		 
		System.out.println("Laptop");
	}
}

 class Tablet implements InterfaceComputer{
	
	 public Tablet(){
		 System.out.println("You have selected a Tablet");
	 }
	 public void show(){
		 
		System.out.println("Tablet");
	}
}
 
 class FactorySettings{
	public InterfaceComputer getType(String computerType){
		
		if (computerType.equalsIgnoreCase("Personal Computer")){
			
			PersonalComputer personalcomputer= new PersonalComputer();
			personalcomputer.show();
			return personalcomputer;
		}
		if (computerType.equals("Laptop")){
			Laptop laptop =new Laptop();
			laptop.show();
			return laptop;
		}
		if (computerType.equals("Tablet")){
			Tablet tablet= new Tablet();
			tablet.show();
			return tablet;
		}
		return null;
	}
	 
}

public class FactoryPatternMain{
	public static void main(String[] args) {
		FactorySettings factorysettings= new FactorySettings();
		Laptop laptop= (Laptop) interfacecomputer; 
		
		
		/*System.out.println("Enter the kind of Computer that you want ");
		Scanner sc= new Scanner(System.in);
		String type=sc.nextLine(); 
		System.out.println(factorysettings.getType(type));*/
		
	}
	
}

