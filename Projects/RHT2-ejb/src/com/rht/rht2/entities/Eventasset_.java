package com.rht.rht2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.089+0000")
@StaticMetamodel(Eventasset.class)
public class Eventasset_ {
	public static volatile SingularAttribute<Eventasset, Assets> assets;
	public static volatile SingularAttribute<Eventasset, Integer> eventAssetEventLength;
	public static volatile SingularAttribute<Eventasset, String> eventAssetEventPeriod;
	public static volatile SingularAttribute<Eventasset, String> eventAssetEventType;
	public static volatile SingularAttribute<Eventasset, Date> eventAssetFirstOccurance;
	public static volatile SingularAttribute<Eventasset, Integer> eventAssetId;
	public static volatile SingularAttribute<Eventasset, Date> eventAssetLastOccurance;
	public static volatile SingularAttribute<Eventasset, byte[]> eventAssetReocurring;
}
