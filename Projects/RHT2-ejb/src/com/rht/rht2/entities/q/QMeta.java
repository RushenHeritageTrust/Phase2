package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.rht.rht2.entities.Meta;

/**
 * QMeta is a Querydsl query type for Meta
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMeta extends EntityPathBase<Meta> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QMeta meta = new QMeta("meta");

	private static final long serialVersionUID = 704471338L;

	public final QAssets assets;

	public final NumberPath<Integer> metaId = createNumber("metaId",
			Integer.class);

	public final QMetaname metaname;

	public final QMetavalue metavalue;

	/**
	 * Constructor for QMeta.
	 * 
	 * @param type
	 *            Class<? extends Meta>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QMeta(Class<? extends Meta> type, PathMetadata<?> metadata,
			PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
		metaname = inits.isInitialized("metaname") ? new QMetaname(
				forProperty("metaname")) : null;
		metavalue = inits.isInitialized("metavalue") ? new QMetavalue(
				forProperty("metavalue")) : null;
	}

	/**
	 * Constructor for QMeta.
	 * 
	 * @param path
	 *            Path<? extends Meta>
	 */
	public QMeta(Path<? extends Meta> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QMeta.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QMeta(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QMeta.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QMeta(PathMetadata<?> metadata, PathInits inits) {
		this(Meta.class, metadata, inits);
	}

	/**
	 * Constructor for QMeta.
	 * 
	 * @param variable
	 *            String
	 */
	public QMeta(String variable) {
		this(Meta.class, forVariable(variable), INITS);
	}

}
