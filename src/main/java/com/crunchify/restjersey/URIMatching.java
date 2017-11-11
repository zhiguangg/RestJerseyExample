package com.crunchify.restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/users")
public class URIMatching {

	@GET
	public Response getUsers() {
		return Response.status(200).entity("getUsers is called").build();
	}

	//URI matching and Parameter
	@GET
	@Path("{name}")
	public Response getUsersByName(@PathParam("name") String name) {
		return Response.status(200).entity("getUsers is called, name :"+name).build();
	}
	
	// Multiple params
	/*
	@GET
	@Path("{year}/{month}/{day}")
	public Response getYearMonthDay(
			@PathParam("year") int year,
			@PathParam("month") int month,
			@PathParam("day") int day) {
		return Response.status(200).entity("Year :" + year + " Month :" + month + " day :" +day).build();
	}
	*/
	//--- NOT Working --//
	
	//URI matching and Regular Expression.  {" variable-name [ ":" regular-expression ] "}
	@GET
	@Path("users/{username: [a-zA-Z][a-zA-Z_0-9]*}")
	public Response getUserByUserName(@PathParam("username") String username) {

	   return Response.status(200)
		.entity("getUserByUserName is called, username : " + username).build();
	}
	
	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn) {

	   return Response.status(200)
		.entity("getUserBookByISBN is called, isbn : " + isbn).build();

	}
}
