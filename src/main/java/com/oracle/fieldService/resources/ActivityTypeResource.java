package com.oracle.fieldService.resources;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.oracle.fieldService.models.ActivityType;


@Path("/activityTypes")
@RequestScoped
public class ActivityTypeResource {

	@PersistenceContext
	private EntityManager em;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object> getAllActivityTypes(){
		CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(ActivityType.class));
		List<Object> activityTypes = em.createQuery(cq).getResultList();
		return activityTypes;
	}
}
