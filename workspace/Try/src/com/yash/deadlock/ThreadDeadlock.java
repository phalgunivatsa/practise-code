package com.yash.deadlock;

public class MyRunnable implements Runnable {
	String str1= "Thread Sun";
	String str2= "Thread Moon";
	public void run(){
		String name= Thread.currentThread().getName();
			
		if(name.equalsIgnoreCase("sun")){
			synchronized(str1){
				System.out.println("This lock is acquired by "+ str1);
				try{Thread.sleep(1500);}
					catch(Exception e){}
			}
			synchronized(str2){
				System.out.println("this lock is released by "+str1);
			}
		}
		else if(name.equalsIgnoreCase("moon")){
			synchronized(str2){
				System.out.println("This lock is acquired by "+str2);
				try{Thread.sleep(1000);}
					catch(Exception e){}
			}
			synchronized(str1){
				System.out.println("this lock is released by "+str2);
			}
		}
}

public class ThreadDeadlock{
	public void main(String[] args) {
		MyRunnable myrunnable= new MyRunnable();
		
		ThreadGroup a;
		Thread t1= new Thread(a, "sun");
		ThreadGroup c;
		Thread t2= new Thread(c, "moon");
		
	}
}