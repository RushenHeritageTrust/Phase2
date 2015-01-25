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
import com.rht.rht2.entities.Notes;

/**
 * QNotes is a Querydsl query type for Notes
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QNotes extends EntityPathBase<Notes> {

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QNotes notes = new QNotes("notes");

	private static final long serialVersionUID = 364996668L;

	public final QAssets assets;

	public final DateTimePath<java.util.Date> notesCreatedOn = createDateTime(
			"notesCreatedOn", java.util.Date.class);

	public final NumberPath<Integer> notesId = createNumber("notesId",
			Integer.class);

	public final StringPath notesNote = createString("notesNote");

	public final QUsers users;

	/**
	 * Constructor for QNotes.
	 * 
	 * @param type
	 *            Class<? extends Notes>
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QNotes(Class<? extends Notes> type, PathMetadata<?> metadata,
			PathInits inits) {
		super(type, metadata, inits);
		assets = inits.isInitialized("assets") ? new QAssets(
				forProperty("assets"), inits.get("assets")) : null;
		users = inits.isInitialized("users") ? new QUsers(forProperty("users"),
				inits.get("users")) : null;
	}

	/**
	 * Constructor for QNotes.
	 * 
	 * @param path
	 *            Path<? extends Notes>
	 */
	public QNotes(Path<? extends Notes> path) {
		this(path.getType(), path.getMetadata(),
				path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QNotes.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QNotes(PathMetadata<?> metadata) {
		this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
	}

	/**
	 * Constructor for QNotes.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 * @param inits
	 *            PathInits
	 */
	public QNotes(PathMetadata<?> metadata, PathInits inits) {
		this(Notes.class, metadata, inits);
	}

	/**
	 * Constructor for QNotes.
	 * 
	 * @param variable
	 *            String
	 */
	public QNotes(String variable) {
		this(Notes.class, forVariable(variable), INITS);
	}

}
