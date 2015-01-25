package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.105+0000")
@StaticMetamodel(Logonhistory.class)
public class Logonhistory_ {
	public static volatile SingularAttribute<Logonhistory, Integer> loginHistoryId;
	public static volatile SingularAttribute<Logonhistory, String> logonHistoryDate;
	public static volatile SingularAttribute<Logonhistory, Users> users;
}
