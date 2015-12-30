package com.yash.rfe.ejb;

import javax.ejb.Local;


@Local
public interface RemoteDemoInterface {
	String greet(String user);
}
