package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:56.436+0000")
@StaticMetamodel(Accountstatus.class)
public class Accountstatus_ {
	public static volatile SingularAttribute<Accountstatus, Integer> accountStatusId;
	public static volatile SingularAttribute<Accountstatus, String> status;
	public static volatile SetAttribute<Accountstatus, Users> userses;
}
