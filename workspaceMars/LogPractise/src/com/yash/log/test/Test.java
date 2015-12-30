package com.yash.log.test;

import org.apache.log4j.Logger;

public class Test {

	final static Logger LOGGER= Logger.getLogger(Test.class.getName());
	
	public static void main(String[] args) {
		Test test = new Test();
		test.writeMessage();
	}
	public void writeMessage(){
		LOGGER.error("Hello Error");
	}
}
