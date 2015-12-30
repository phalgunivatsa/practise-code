
public class MyException extends Exception {
	public static final long serialVersionUID= 289379279L; 
	
	public MyException(){
		
	}
	public MyException(String message){
		super(message);
	}
	public MyException(Throwable cause){
		super(cause);
	}
	
}
