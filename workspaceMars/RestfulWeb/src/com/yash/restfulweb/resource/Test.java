package com.yash.restfulweb.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.restfulweb.domain.User;

@Path("/Test")
public class Test {
User user= new User();

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List getUser() {
		List list= new ArrayList();
		list.add(user);
		return list;
		
		
		
	}
	@POST
	@Path("/display")
	@Consumes(MediaType.APPLICATION_JSON)
	public User showData (User user){
		return user;

		}
		
		
	
}
