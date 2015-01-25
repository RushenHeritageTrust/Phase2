package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Objectasset;

/**
 * QObjectasset is a Querydsl query type for Objectasset
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QObjectasset extends EntityPathBase<Objectasset> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QObjectasset objectasset = new QObjectasset(
			"objectasset");

	private static final long serialVersionUID = -828225460L;

	public final QAssets assets;

	public final NumberPath<Integer> objectAssetId = createNumber(
			"objectAssetId", Integer.class);

	public final NumberPath<Integer> objectAssetObjectAge = createNumber(
			"objectAssetObjectAge", Integer.class);

	public final StringPath objectAssetObjectAgePeriod = createString("objectAssetObjectAgePeriod");

	public final DateTimePath<java.util.Date> objectAssetObjectCreatedOn = createDateTime(
			"objectAssetObjectCreatedOn", java.util.Date.class);

	public final StringPath objectAssetObjectType = createString("objectAssetObjectType");

	/**
	 * Constructor for QObjectasset.
	 * 
	 * @param type
	 *            Class<? extends Objectasset>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QObjectasset(Class<? extends Objectasset> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
	}

	/**
	 * Constructor for QObjectasset.
	 * 
	 * @param path
	 *            Path<? extends Objectasset>
	 */
	public QObjectasset(Path<? extends Objectasset> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QObjectasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QObjectasset(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QObjectasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QObjectasset(PathMetadata<?> metadata, PathInits inits) {
		this(Objectasset.class, metadata, inits);
	}

	/**
	 * Constructor for QObjectasset.
	 * 
	 * @param variable
	 *            String
	 */
	public QObjectasset(String variable) {
		this(Objectasset.class, forVariable(variable), INITS);
	}

}
