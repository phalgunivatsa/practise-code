package threads;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t1= new Thread(new ThreadPush());
		t1.start();
		Thread t2= new Thread(new ThreadPop());
		t2.start();
	}

}
