package com.yash.restfulweb.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.yash.restfulweb.domain.User;

@Path("/Test")
public class Test {
	User user = new User();

	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser() {
		return user;

	}
}
