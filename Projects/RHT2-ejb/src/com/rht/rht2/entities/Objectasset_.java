package com.rht.rht2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.151+0000")
@StaticMetamodel(Objectasset.class)
public class Objectasset_ {
	public static volatile SingularAttribute<Objectasset, Assets> assets;
	public static volatile SingularAttribute<Objectasset, Integer> objectAssetId;
	public static volatile SingularAttribute<Objectasset, Integer> objectAssetObjectAge;
	public static volatile SingularAttribute<Objectasset, String> objectAssetObjectAgePeriod;
	public static volatile SingularAttribute<Objectasset, Date> objectAssetObjectCreatedOn;
	public static volatile SingularAttribute<Objectasset, String> objectAssetObjectType;
}
