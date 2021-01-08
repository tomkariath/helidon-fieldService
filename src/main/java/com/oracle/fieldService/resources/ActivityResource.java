package com.oracle.fieldService.resources;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.oracle.fieldService.models.Activity;

@Path("/activities")
@RequestScoped
public class ActivityResource {
	private static final Logger logger = Logger.getLogger(ActivityResource.class.getName());

	@PersistenceContext
	private EntityManager em;

	// create
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Transactional
	public void createActivity(Activity activity) {
		em.persist(activity);
	}

	// search
	@GET
	@Path("/{activityId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Activity findActivity(@PathParam("activityId") Long activityId) {
		return em.find(Activity.class, activityId);
	}

	// view
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Object> getAllActivities() {
		CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(Activity.class));
		List<Object> activities = em.createQuery(cq).getResultList();
		return activities;
	}

	// edit
	@PUT
	@Path("/{activityId}")
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void editActivity(@PathParam("activityId") Long id, Activity updatedActivity) {
		logger.log(Level.INFO, "updatedActivtiy: " + updatedActivity.toString());
		Activity activity = em.find(Activity.class, id);
		activity.updateActivity(updatedActivity);
		em.merge(activity);
	}

	@DELETE
	@Transactional
	@Path("/{activityId}")
	public void removeDepartment(@PathParam("activityId") Long activityId) {
		Activity entity = em.find(Activity.class, activityId);
		em.remove(em.merge(entity));
	}
}
