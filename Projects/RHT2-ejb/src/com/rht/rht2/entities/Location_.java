package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.097+0000")
@StaticMetamodel(Location.class)
public class Location_ {
	public static volatile SetAttribute<Location, Assets> assetses;
	public static volatile SingularAttribute<Location, Integer> locationId;
	public static volatile SingularAttribute<Location, String> locationLabel;
	public static volatile SingularAttribute<Location, Float> locationLat;
	public static volatile SingularAttribute<Location, Float> locationLong;
	public static volatile SingularAttribute<Location, String> locationPostcode;
}
