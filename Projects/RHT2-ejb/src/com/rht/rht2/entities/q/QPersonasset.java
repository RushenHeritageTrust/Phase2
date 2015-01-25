package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Personasset;

/**
 * QPersonasset is a Querydsl query type for Personasset
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPersonasset extends EntityPathBase<Personasset> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QPersonasset personasset = new QPersonasset(
			"personasset");

	private static final long serialVersionUID = 23391734L;

	public final QAssets assets;

	public final StringPath personAssetForename = createString("personAssetForename");

	public final NumberPath<Integer> personAssetId = createNumber(
			"personAssetId", Integer.class);

	public final StringPath personAssetMaidenName = createString("personAssetMaidenName");

	public final StringPath personAssetOtherName = createString("personAssetOtherName");

	public final StringPath personAssetTitle = createString("personAssetTitle");

	public final StringPath personsAssetSurname = createString("personsAssetSurname");

	/**
	 * Constructor for QPersonasset.
	 * 
	 * @param type
	 *            Class<? extends Personasset>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QPersonasset(Class<? extends Personasset> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
	}

	/**
	 * Constructor for QPersonasset.
	 * 
	 * @param path
	 *            Path<? extends Personasset>
	 */
	public QPersonasset(Path<? extends Personasset> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QPersonasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QPersonasset(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QPersonasset.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QPersonasset(PathMetadata<?> metadata, PathInits inits) {
		this(Personasset.class, metadata, inits);
	}

	/**
	 * Constructor for QPersonasset.
	 * 
	 * @param variable
	 *            String
	 */
	public QPersonasset(String variable) {
		this(Personasset.class, forVariable(variable), INITS);
	}

}
