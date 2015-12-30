import java.io.*;
public class DeserializationClass
{
   public static void main(String [] args)
   {
      Employee emp = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("C:\\employee.txt");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         emp = (Employee) in.readObject();
         in.close();
         fileIn.close();
         System.out.println(emp);
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + emp.name);
      System.out.println("Address: " + emp.address);
      System.out.println("SSN: " + emp.SSN);
      System.out.println("Number: " + emp.number);
    }
}