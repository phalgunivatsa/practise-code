package com.yash.trainingmanagement.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import com.yash.trainingmanagement.domain.User;
import com.yash.trainingmanagement.util.ConnectionProvider;


@Stateless
@LocalBean
public class UserServiceBean implements UserServiceBeanLocal {

    public UserServiceBean() {
       
    }
	@Override
	public void register(User user) {
		String query="insert into user(name,contact,email_id,designation_id,status_id,role_id,username,password) "
	+ "values('"+user.getName()+"','"+user.getContact()+"','"+user.getEmail_id()+"',"+user.getDesignation_id()+","+user.getStatus_id()+","+user.getRole_id()+",'"+user.getUsername()+"','"+user.getPassword()+"')";
		System.out.println(query);
		ConnectionProvider.update(query);
	}

}
