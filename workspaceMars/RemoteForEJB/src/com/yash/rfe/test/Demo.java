package com.yash.rfe.test;

import javax.ejb.EJB;


import com.yash.rfe.ejb.RemoteDemoInterface;

public class Demo {
	@EJB
	RemoteDemoInterface remoteDemoInterface;
	public static void main(String[] args){
		System.out.println();
	}
}
