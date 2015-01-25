package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.ArrayPath;
import com.mysema.query.types.path.DateTimePath;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Eventasset;

/**
 * QEventasset is a Querydsl query type for Eventasset
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QEventasset extends EntityPathBase<Eventasset> {

	public static final QEventasset eventasset = new QEventasset("eventasset");

	private static final PathInits INITS = PathInits.DIRECT2;

	private static final long serialVersionUID = 2108990459L;

	public final QAssets assets;

	public final NumberPath<Integer> eventAssetEventLength = createNumber(
			"eventAssetEventLength", Integer.class);

	public final StringPath eventAssetEventPeriod = createString("eventAssetEventPeriod");

	public final StringPath eventAssetEventType = createString("eventAssetEventType");

	public final DateTimePath<java.util.Date> eventAssetFirstOccurance = createDateTime(
			"eventAssetFirstOccurance", java.util.Date.class);

	public final NumberPath<Integer> eventAssetId = createNumber(
			"eventAssetId", Integer.class);

	public final DateTimePath<java.util.Date> eventAssetLastOccurance = createDateTime(
			"eventAssetLastOccurance", java.util.Date.class);

	public final ArrayPath<byte[], Byte> eventAssetReocurring = createArray(
			"eventAssetReocurring", byte[].class);

	/**
	 * Constructor for QEventasset.
	 * 
	 * @param type
	 *            Class<? extends Eventasset>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QEventasset(Class<? extends Eventasset> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
	}

	/**
	 * Constructor for QEventasset.
	 * 
	 * @param path
	 *            Path<? extends Eventasset>
	 */
	public QEventasset(Path<? extends Eventasset> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QEventasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QEventasset(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QEventasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QEventasset(PathMetadata<?> metadata, PathInits inits) {
		this(Eventasset.class, metadata, inits);
	}

	/**
	 * Constructor for QEventasset.
	 * 
	 * @param variable
	 *            String
	 */
	public QEventasset(String variable) {
		this(Eventasset.class, forVariable(variable), INITS);
	}

}
