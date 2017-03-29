/**
 * 
 */
package com.rajiv.demo1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Raji
 *
 */
@Path("/first")//url for the resource
public class FirstResources {

	@GET//this is a get request
	@Produces("text/html")//mime type to be produce by this resource
	public String getMessage(){
		return"<html><body><h2>Hey this is my first rest project </body></body></html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/second/{name}")
	public String getparamMessage(@PathParam("name") String name){
		return "first name is "+name;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/cust")
	public customers getcustomers(){
		customers c=new customers("1","rajiv","ranjan");
		return c;
	}
	
}
