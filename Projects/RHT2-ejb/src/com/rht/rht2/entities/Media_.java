package com.rht.rht2.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-01-25T12:29:57.113+0000")
@StaticMetamodel(Media.class)
public class Media_ {
	public static volatile SingularAttribute<Media, Assets> assets;
	public static volatile SingularAttribute<Media, String> mediaFilePath;
	public static volatile SingularAttribute<Media, Integer> mediaId;
	public static volatile SingularAttribute<Media, String> mediaThumbnail;
	public static volatile SingularAttribute<Media, Integer> mediaType;
	public static volatile SingularAttribute<Media, String> mediaUrl;
}
