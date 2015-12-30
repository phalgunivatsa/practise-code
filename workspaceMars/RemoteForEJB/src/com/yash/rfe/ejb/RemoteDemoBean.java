package com.yash.rfe.ejb;

import javax.ejb.Stateless;

@Stateless(mappedName="remoteDemo")

public class RemoteDemoBean implements RemoteDemoInterface {

	@Override
	public String greet(String user) {
		return "Hello " + user + ", have a pleasant day!";
	}

}
