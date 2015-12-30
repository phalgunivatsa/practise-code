package yash.com;

class Animal {
	public void show(String str) {
		System.out.println("Class Animal");
	}
}

class Goat extends Animal {
	public void show(String str) {
		System.out.println("Class Goat extends Animal");
	}
}

class Another extends Goat {
	public void show(String str) {
		System.out.println("Class another extends Animal");
	}
}

class BlackGoat extends Goat {

}

public class ClassCasteException {
	public static void main(String[] args) {
		Animal animal = new BlackGoat();
		// Another another = (Another) new Goat();
		Another another = new Another();
		
		if(animal instanceof BlackGoat){
			System.out.println("Yes , It is");
			BlackGoat blackGoat = (BlackGoat)animal;
		}
		else {
			System.out.println("No , It is not");
			
		}
		
		
		
	}

}
