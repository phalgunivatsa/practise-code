import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[]args) throws IOException{
		  Employee emp = new Employee();
	      emp.name = "Reyan Ali";
	      emp.address = "Phokka Kuan, Ambehta Peer";
	      emp.SSN = 11122333;
	      emp.number = 101;
		
		try {
			FileOutputStream fileOut= new FileOutputStream("/employee.txt");
			ObjectOutputStream outputStream= new ObjectOutputStream(fileOut);
			outputStream.writeObject(emp);
			outputStream.close();
			fileOut.close();
			System.out.println(emp);
			} 	catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
