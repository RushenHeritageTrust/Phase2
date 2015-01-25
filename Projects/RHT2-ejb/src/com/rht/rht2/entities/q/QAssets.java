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
import com.rht.rht2.entities.Assets;

/**
 * QAssets is a Querydsl query type for Assets
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAssets extends EntityPathBase<Assets> {

	public static final QAssets assets1 = new QAssets("assets1");

	private static final PathInits INITS = PathInits.DIRECT2;

	private static final long serialVersionUID = -1938519704L;

	public final DateTimePath<java.util.Date> assetAuditOn = createDateTime(
			"assetAuditOn", java.util.Date.class);

	public final DateTimePath<java.util.Date> assetCreatedOn = createDateTime(
			"assetCreatedOn", java.util.Date.class);

	public final DateTimePath<java.util.Date> assetEndDate = createDateTime(
			"assetEndDate", java.util.Date.class);

	public final NumberPath<Integer> assetId = createNumber("assetId",
			Integer.class);

	public final StringPath assetLabelEng = createString("assetLabelEng");

	public final StringPath assetLabelManx = createString("assetLabelManx");

	public final DateTimePath<java.util.Date> assetModOn = createDateTime(
			"assetModOn", java.util.Date.class);

	public final QAssets assets;

	public final SetPath<Object, SimplePath<Object>> assetses = this
			.<Object, SimplePath<Object>> createSet("assetses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final DateTimePath<java.util.Date> assetStartDate = createDateTime(
			"assetStartDate", java.util.Date.class);

	public final QAssetstatus assetstatus;

	public final SetPath<Object, SimplePath<Object>> eventassets = this
			.<Object, SimplePath<Object>> createSet("eventassets",
					Object.class, SimplePath.class, PathInits.DIRECT2);

	public final QLocation location;

	public final SetPath<Object, SimplePath<Object>> medias = this
			.<Object, SimplePath<Object>> createSet("medias", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> metas = this
			.<Object, SimplePath<Object>> createSet("metas", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> noteses = this
			.<Object, SimplePath<Object>> createSet("noteses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> objectassets = this
			.<Object, SimplePath<Object>> createSet("objectassets",
					Object.class, SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> personassets = this
			.<Object, SimplePath<Object>> createSet("personassets",
					Object.class, SimplePath.class, PathInits.DIRECT2);

	public final SetPath<Object, SimplePath<Object>> placeassets = this
			.<Object, SimplePath<Object>> createSet("placeassets",
					Object.class, SimplePath.class, PathInits.DIRECT2);

	public final QUsers usersByAssetAuditByUserId;

	public final QUsers usersByAssetCreatedByUserId;

	public final QUsers usersByAssetModByUserId;

	/**
	 * Constructor for QAssets.
	 * 
	 * @param type
	 *            Class<? extends Assets>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QAssets(Class<? extends Assets> type, PathMetadata<?> metadata,
			PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
				assetstatus = inits.isInitialized("assetstatus") ? new QAssetstatus(
						forProperty("assetstatus")) : null;
						location = inits.isInitialized("location") ? new QLocation(
								forProperty("location")) : null;
								usersByAssetAuditByUserId = inits
										.isInitialized("usersByAssetAuditByUserId") ? new QUsers(
												forProperty("usersByAssetAuditByUserId"),
												inits.get("usersByAssetAuditByUserId")) : null;
												usersByAssetCreatedByUserId = inits
														.isInitialized("usersByAssetCreatedByUserId") ? new QUsers(
																forProperty("usersByAssetCreatedByUserId"),
																inits.get("usersByAssetCreatedByUserId")) : null;
																usersByAssetModByUserId = inits
																		.isInitialized("usersByAssetModByUserId") ? new QUsers(
																				forProperty("usersByAssetModByUserId"),
																				inits.get("usersByAssetModByUserId")) : null;
	}

	/**
	 * Constructor for QAssets.
	 * 
	 * @param path
	 *            Path<? extends Assets>
	 */
	public QAssets(Path<? extends Assets> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QAssets.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QAssets(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QAssets.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QAssets(PathMetadata<?> metadata, PathInits inits) {
		this(Assets.class, metadata, inits);
	}

	/**
	 * Constructor for QAssets.
	 * 
	 * @param variable
	 *            String
	 */
	public QAssets(String variable) {
		this(Assets.class, forVariable(variable), INITS);
	}

}
