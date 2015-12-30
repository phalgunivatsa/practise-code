package com.yash.rm.client;


public class RemoteEJBClient {
	public static void main (String[] args){
		invokeStatelessBean();
	}
	
	private static void invokeStatelessBean(){
		final RemoteDemoInterface statelessRemoteDemoInterface = lookupRemoteDemoInterface();
	}
}
