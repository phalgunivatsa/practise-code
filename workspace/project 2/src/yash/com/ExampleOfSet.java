package yash.com;
import java.util.*;

public class ExampleOfSet {

	public static void main(String[] args) {

		Set set = new HashSet();

		SetCustomer customer1 = new SetCustomer(1, "Ram", 11);
		SetCustomer customer2 = new SetCustomer(2, "Aadya", 12);
		SetCustomer customer3 = new SetCustomer(3, "Shashank", 76);
		SetCustomer customer4 = new SetCustomer(4, "Phalguni", 43);
		SetCustomer customer5 = new SetCustomer(5, "Honey", 32);

		set.add(customer1);
		set.add(customer2);
		set.add(customer3);
		set.add(customer4);
		set.add(customer5);

		System.out.println(set);

	}

}
