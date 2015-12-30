package threads;

public class ThreadPush implements Runnable {
	MyStack mystack=new MyStack();
	@Override
	public void run() {
		
		mystack.push(5);
	}
	
}