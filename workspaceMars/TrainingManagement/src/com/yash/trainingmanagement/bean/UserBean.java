package com.yash.trainingmanagement.bean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import com.yash.trainingmanagement.domain.User;
import com.yash.trainingmanagement.service.UserServiceBeanLocal;

@ManagedBean
@SessionScoped
public class UserBean {
	private String name;
	private String contact;
	private String email_id;
	private int designation_id;
	private int status_id;
	private int role_id;
	private String username;
	private String password;
	private Boolean rememberMe;
	@EJB
	UserServiceBeanLocal userServiceBeanLocal;
	@Inject
	User user;
	public Boolean getRememberMe() {
		return rememberMe;
	}
	public void setRememberMe(Boolean rememberMe) {
		this.rememberMe = rememberMe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String register()
	{	
		userServiceBeanLocal.register(user);
		return "login";
	}
	public void authenticate()
	{	
		if(rememberMe)
		{
		}
	}
	
}
