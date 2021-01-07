package com.oracle.fieldService.jpa;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/example")
@RequestScoped
public class ExampleResource {

	@PersistenceContext
	private EntityManager em;
	
	@GET
	@Transactional
	@Path("/response/{salutation}")
	@Produces("text/plain")
	public String getResponse(@PathParam("salutation") String salutation) {
		final Greeting greeting = this.em.find(Greeting.class, salutation);
		final String response;
		
		if (greeting == null) {
			response = null;
		}
		else {
			response = greeting.getResponse();
		}
		
		return response;
	}
	
}
