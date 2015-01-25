package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:56.450+0000")
@StaticMetamodel(Assetrelations.class)
public class Assetrelations_ {
	public static volatile SingularAttribute<Assetrelations, Integer> assetRelationsId;
	public static volatile SingularAttribute<Assetrelations, Assets> assetsByAssetRelationsAssetDestId;
	public static volatile SingularAttribute<Assetrelations, Assets> assetsByAssetRelationsAssetSourceId;
	public static volatile SingularAttribute<Assetrelations, Relationtypes> relationtypes;
}
