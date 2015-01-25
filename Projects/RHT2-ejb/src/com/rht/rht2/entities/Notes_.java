package com.rht.rht2.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.143+0000")
@StaticMetamodel(Notes.class)
public class Notes_ {
	public static volatile SingularAttribute<Notes, Assets> assets;
	public static volatile SingularAttribute<Notes, Date> notesCreatedOn;
	public static volatile SingularAttribute<Notes, Integer> notesId;
	public static volatile SingularAttribute<Notes, String> notesNote;
	public static volatile SingularAttribute<Notes, Users> users;
}
