package com.rht.rht2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.073+0000")
@StaticMetamodel(Assets.class)
public class Assets_ {
	public static volatile SingularAttribute<Assets, Date> assetAuditOn;
	public static volatile SingularAttribute<Assets, Date> assetCreatedOn;
	public static volatile SingularAttribute<Assets, Date> assetEndDate;
	public static volatile SingularAttribute<Assets, Integer> assetId;
	public static volatile SingularAttribute<Assets, String> assetLabelEng;
	public static volatile SingularAttribute<Assets, String> assetLabelManx;
	public static volatile SingularAttribute<Assets, Date> assetModOn;
	public static volatile SingularAttribute<Assets, Assets> assets;
	public static volatile SetAttribute<Assets, Assets> assetses;
	public static volatile SingularAttribute<Assets, Date> assetStartDate;
	public static volatile SingularAttribute<Assets, Assetstatus> assetstatus;
	public static volatile SetAttribute<Assets, Eventasset> eventassets;
	public static volatile SingularAttribute<Assets, Location> location;
	public static volatile SetAttribute<Assets, Media> medias;
	public static volatile SetAttribute<Assets, Meta> metas;
	public static volatile SetAttribute<Assets, Notes> noteses;
	public static volatile SetAttribute<Assets, Objectasset> objectassets;
	public static volatile SetAttribute<Assets, Personasset> personassets;
	public static volatile SetAttribute<Assets, Placeasset> placeassets;
	public static volatile SingularAttribute<Assets, Users> usersByAssetAuditByUserId;
	public static volatile SingularAttribute<Assets, Users> usersByAssetCreatedByUserId;
	public static volatile SingularAttribute<Assets, Users> usersByAssetModByUserId;
}
