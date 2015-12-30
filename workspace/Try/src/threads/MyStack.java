package threads;

public class MyStack {
	int max_size = 10;
	int top = -1;
	int sArray[] = new int[10];

	public void push(int a) {
		// TODO Auto-generated method stub
		sArray[++top] = a;
		System.out.println("Stack values :" + a);
		System.out.println("Push method called");
	}

	public int pop() {

		top = 0;

		if (!isEmpty()) {
			int a = sArray[top--];
			System.out.println("Popped:......." + a);
		} else {
			System.out.println("STACK IS EMPTY !!");
		}
		return top;
	}

	/*
	 * if(!isEmpty()){ top=0; System.out.println("Pop method called"); return
	 * sArray[top--]; } }
	 */

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == max_size - 1);
	}

}
