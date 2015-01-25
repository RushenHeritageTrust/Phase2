package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Placeasset;

/**
 * QPlaceasset is a Querydsl query type for Placeasset
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPlaceasset extends EntityPathBase<Placeasset> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QPlaceasset placeasset = new QPlaceasset("placeasset");

	private static final long serialVersionUID = 858667438L;

	public final QAssets assets;

	public final StringPath placeAssetAddress1 = createString("placeAssetAddress1");

	public final StringPath placeAssetAddress2 = createString("placeAssetAddress2");

	public final StringPath placeAssetArea = createString("placeAssetArea");

	public final NumberPath<Integer> placeAssetId = createNumber(
			"placeAssetId", Integer.class);

	public final StringPath placeAssetLocationName = createString("placeAssetLocationName");

	public final StringPath placeAssetNumberName = createString("placeAssetNumberName");

	public final StringPath placeAssetParish = createString("placeAssetParish");

	public final StringPath placeAssetTown = createString("placeAssetTown");

	/**
	 * Constructor for QPlaceasset.
	 * 
	 * @param type
	 *            Class<? extends Placeasset>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QPlaceasset(Class<? extends Placeasset> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
	}

	/**
	 * Constructor for QPlaceasset.
	 * 
	 * @param path
	 *            Path<? extends Placeasset>
	 */
	public QPlaceasset(Path<? extends Placeasset> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QPlaceasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QPlaceasset(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QPlaceasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QPlaceasset(PathMetadata<?> metadata, PathInits inits) {
		this(Placeasset.class, metadata, inits);
	}

	/**
	 * Constructor for QPlaceasset.
	 * 
	 * @param variable
	 *            String
	 */
	public QPlaceasset(String variable) {
		this(Placeasset.class, forVariable(variable), INITS);
	}

}
