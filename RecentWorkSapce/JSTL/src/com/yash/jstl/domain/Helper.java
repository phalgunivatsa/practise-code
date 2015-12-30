package com.yash.jstl.domain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helper {


	public void doProcess(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAddress());
	}
}
