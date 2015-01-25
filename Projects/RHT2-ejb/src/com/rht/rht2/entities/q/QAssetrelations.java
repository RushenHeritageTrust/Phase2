package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.rht.rht2.entities.Assetrelations;

/**
 * QAssetrelations is a Querydsl query type for Assetrelations
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAssetrelations extends EntityPathBase<Assetrelations> {

	public static final QAssetrelations assetrelations = new QAssetrelations(
			"assetrelations");

	private static final PathInits INITS = PathInits.DIRECT2;

	private static final long serialVersionUID = 410388972L;

	public final NumberPath<Integer> assetRelationsId = createNumber(
			"assetRelationsId", Integer.class);

	public final QAssets assetsByAssetRelationsAssetDestId;

	public final QAssets assetsByAssetRelationsAssetSourceId;

	public final QRelationtypes relationtypes;

	/**
	 * Constructor for QAssetrelations.
	 * 
	 * @param type
	 *            Class<? extends Assetrelations>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QAssetrelations(Class<? extends Assetrelations> type,
			PathMetadata<?> metadata, PathInits inits) {
		super(type, metadata, inits);
		assetsByAssetRelationsAssetDestId = inits
				.isInitialized("assetsByAssetRelationsAssetDestId") ? new QAssets(
				forProperty("assetsByAssetRelationsAssetDestId"),
				inits.get("assetsByAssetRelationsAssetDestId")) : null;
		assetsByAssetRelationsAssetSourceId = inits
				.isInitialized("assetsByAssetRelationsAssetSourceId") ? new QAssets(
				forProperty("assetsByAssetRelationsAssetSourceId"),
				inits.get("assetsByAssetRelationsAssetSourceId")) : null;
		relationtypes = inits.isInitialized("relationtypes") ? new QRelationtypes(
				forProperty("relationtypes")) : null;
	}

	/**
	 * Constructor for QAssetrelations.
	 * 
	 * @param path
	 *            Path<? extends Assetrelations>
	 */
	public QAssetrelations(Path<? extends Assetrelations> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QAssetrelations.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QAssetrelations(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QAssetrelations.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QAssetrelations(PathMetadata<?> metadata, PathInits inits) {
		this(Assetrelations.class, metadata, inits);
	}

	/**
	 * Constructor for QAssetrelations.
	 * 
	 * @param variable
	 *            String
	 */
	public QAssetrelations(String variable) {
		this(Assetrelations.class, forVariable(variable), INITS);
	}

}
