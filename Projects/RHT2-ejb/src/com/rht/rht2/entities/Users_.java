package com.rht.rht2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.193+0000")
@StaticMetamodel(Users.class)
public class Users_ {
	public static volatile SingularAttribute<Users, Accountstatus> accountstatus;
	public static volatile SetAttribute<Users, Assets> assetsesForAssetAuditByUserId;
	public static volatile SetAttribute<Users, Assets> assetsesForAssetCreatedByUserId;
	public static volatile SetAttribute<Users, Assets> assetsesForAssetModByUserId;
	public static volatile SetAttribute<Users, Logonhistory> logonhistories;
	public static volatile SetAttribute<Users, Notes> noteses;
	public static volatile SingularAttribute<Users, Date> userCreatedOn;
	public static volatile SingularAttribute<Users, Integer> userId;
	public static volatile SingularAttribute<Users, Date> userLastLogOn;
	public static volatile SingularAttribute<Users, Integer> userModById;
	public static volatile SingularAttribute<Users, Date> userModOn;
	public static volatile SingularAttribute<Users, String> userPassword;
	public static volatile SingularAttribute<Users, Users> users;
	public static volatile SetAttribute<Users, Users> userses;
	public static volatile SingularAttribute<Users, String> userUsername;
}
