package com.oracle.fieldService.jpa;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Greeting.class)
public abstract class Greeting_ {

	public static volatile SingularAttribute<Greeting, String> response;
	public static volatile SingularAttribute<Greeting, String> salutation;

	public static final String RESPONSE = "response";
	public static final String SALUTATION = "salutation";

}

