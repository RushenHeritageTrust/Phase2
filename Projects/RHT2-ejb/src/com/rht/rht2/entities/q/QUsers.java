package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.SetPath;
import com.mysema.query.types.path.SimplePath;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Users;

/**
 * QUsers is a Querydsl query type for Users
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsers extends EntityPathBase<Users> {

	private static final PathInits INITS = PathInits.DIRECT2;

	private static final long serialVersionUID = 371566467L;

	public static final QUsers users1 = new QUsers("users1");

	public final QAccountstatus accountstatus;

	public final SetPath<Object, SimplePath<Object>> assetsesForAssetAuditByUserId = this
			.<Object, SimplePath<Object>> createSet(
					"assetsesForAssetAuditByUserId", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> assetsesForAssetCreatedByUserId = this
			.<Object, SimplePath<Object>> createSet(
					"assetsesForAssetCreatedByUserId", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> assetsesForAssetModByUserId = this
			.<Object, SimplePath<Object>> createSet(
					"assetsesForAssetModByUserId", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> logonhistories = this
			.<Object, SimplePath<Object>> createSet("logonhistories",
					Object.class, SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> noteses = this
			.<Object, SimplePath<Object>> createSet("noteses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final DateTimePath<java.util.Date> userCreatedOn = createDateTime(
			"userCreatedOn", java.util.Date.class);

	public final NumberPath<Integer> userId = createNumber("userId",
			Integer.class);

	public final DateTimePath<java.util.Date> userLastLogOn = createDateTime(
			"userLastLogOn", java.util.Date.class);

	public final NumberPath<Integer> userModById = createNumber("userModById",
			Integer.class);

	public final DateTimePath<java.util.Date> userModOn = createDateTime(
			"userModOn", java.util.Date.class);

	public final StringPath userPassword = createString("userPassword");

	public final QUsers users;

	public final SetPath<Object, SimplePath<Object>> userses = this
			.<Object, SimplePath<Object>> createSet("userses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final StringPath userUsername = createString("userUsername");

	/**
	 * Constructor for QUsers.
	 * 
	 * @param type
	 *            Class<? extends Users>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QUsers(Class<? extends Users> type, PathMetadata<?> metadata,
			PathInits inits) {
		super(type, metadata, inits);
		accountstatus = inits.isInitialized("accountstatus") ? new QAccountstatus(
				forProperty("accountstatus")) : null;
		users = inits.isInitialized("users") ? new QUsers(forProperty("users"),
				inits.get("users")) : null;
	}

	/**
	 * Constructor for QUsers.
	 * 
	 * @param path
	 *            Path<? extends Users>
	 */
	public QUsers(Path<? extends Users> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QUsers.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QUsers(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QUsers.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QUsers(PathMetadata<?> metadata, PathInits inits) {
		this(Users.class, metadata, inits);
	}

	/**
	 * Constructor for QUsers.
	 * 
	 * @param variable
	 *            String
	 */
	public QUsers(String variable) {
		this(Users.class, forVariable(variable), INITS);
	}

}
