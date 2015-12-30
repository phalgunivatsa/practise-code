package com.yash.trainingmanagement.service;

import javax.ejb.Local;

import com.yash.trainingmanagement.domain.User;

@Local
public interface UserServiceBeanLocal {
	public void register(User user);
	
}
