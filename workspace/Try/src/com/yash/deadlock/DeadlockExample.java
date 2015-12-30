package com.yash.deadlock;

public class DeadlockExample extends Thread {
	
		String s1= "StringOne";
		String s2= "StringTwo";
		Thread t1= new Thread(){
			
			public void run(){
				synchronized(s1){
				System.out.println("The string in thread two is:"+s2);
				}
			}
		};
		
		Thread t2= new Thread(){
			public void run(){
				synchronized(s2){
					System.out.println("The string in thread one is:"+s1);	
					}
				}
		};

	public static void main(String[] args){
		DeadlockExample deadlock= new DeadlockExample();
		deadlock.t1.start();
		deadlock.t2.start();
		}


}




