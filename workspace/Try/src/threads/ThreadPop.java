package threads;

public class ThreadPop implements Runnable {
	MyStack mystack=new MyStack();
	@Override
	public void run() {
		
		mystack.pop();
	}

}
