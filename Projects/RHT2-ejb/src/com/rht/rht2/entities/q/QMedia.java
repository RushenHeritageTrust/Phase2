package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Media;

/**
 * QMedia is a Querydsl query type for Media
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMedia extends EntityPathBase<Media> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QMedia media = new QMedia("media");

	private static final long serialVersionUID = 363759967L;

	public final QAssets assets;

	public final StringPath mediaFilePath = createString("mediaFilePath");

	public final NumberPath<Integer> mediaId = createNumber("mediaId",
			Integer.class);

	public final StringPath mediaThumbnail = createString("mediaThumbnail");

	public final NumberPath<Integer> mediaType = createNumber("mediaType",
			Integer.class);

	public final StringPath mediaUrl = createString("mediaUrl");

	/**
	 * Constructor for QMedia.
	 * 
	 * @param type
	 *            Class<? extends Media>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QMedia(Class<? extends Media> type, PathMetadata<?> metadata,
			PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
	}

	/**
	 * Constructor for QMedia.
	 * 
	 * @param path
	 *            Path<? extends Media>
	 */
	public QMedia(Path<? extends Media> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QMedia.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QMedia(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QMedia.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QMedia(PathMetadata<?> metadata, PathInits inits) {
		this(Media.class, metadata, inits);
	}

	/**
	 * Constructor for QMedia.
	 * 
	 * @param variable
	 *            String
	 */
	public QMedia(String variable) {
		this(Media.class, forVariable(variable), INITS);
	}

}
