package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.128+0000")
@StaticMetamodel(Metaname.class)
public class Metaname_ {
	public static volatile SingularAttribute<Metaname, Integer> metaNameId;
	public static volatile SingularAttribute<Metaname, String> metaNameName;
	public static volatile SetAttribute<Metaname, Meta> metas;
}
