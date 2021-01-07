package com.oracle.fieldService.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inventory.class)
public abstract class Inventory_ {

	public static volatile SingularAttribute<Inventory, String> inventoryType;
	public static volatile SingularAttribute<Inventory, Long> quantity;
	public static volatile SingularAttribute<Inventory, String> serialNumber;
	public static volatile SingularAttribute<Inventory, Long> inventoryId;
	public static volatile SingularAttribute<Inventory, String> model;

	public static final String INVENTORY_TYPE = "inventoryType";
	public static final String QUANTITY = "quantity";
	public static final String SERIAL_NUMBER = "serialNumber";
	public static final String INVENTORY_ID = "inventoryId";
	public static final String MODEL = "model";

}

