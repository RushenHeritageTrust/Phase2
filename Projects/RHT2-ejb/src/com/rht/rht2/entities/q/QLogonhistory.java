package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Logonhistory;

/**
 * QLogonhistory is a Querydsl query type for Logonhistory
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLogonhistory extends EntityPathBase<Logonhistory> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QLogonhistory logonhistory = new QLogonhistory(
			"logonhistory");

	private static final long serialVersionUID = 1971875126L;

	public final NumberPath<Integer> loginHistoryId = createNumber(
			"loginHistoryId", Integer.class);

	public final StringPath logonHistoryDate = createString("logonHistoryDate");

	public final QUsers users;

	/**
	 * Constructor for QLogonhistory.
	 * 
	 * @param type
	 *            Class<? extends Logonhistory>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QLogonhistory(Class<? extends Logonhistory> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		users = inits.isInitialized("users") ? new QUsers(forProperty("users"),
				inits.get("users")) : null;
	}

	/**
	 * Constructor for QLogonhistory.
	 * 
	 * @param path
	 *            Path<? extends Logonhistory>
	 */
	public QLogonhistory(Path<? extends Logonhistory> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QLogonhistory.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QLogonhistory(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QLogonhistory.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QLogonhistory(PathMetadata<?> metadata, PathInits inits) {
		this(Logonhistory.class, metadata, inits);
	}

	/**
	 * Constructor for QLogonhistory.
	 * 
	 * @param variable
	 *            String
	 */
	public QLogonhistory(String variable) {
		this(Logonhistory.class, forVariable(variable), INITS);
	}

}
