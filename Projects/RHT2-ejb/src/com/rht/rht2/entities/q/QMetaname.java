package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.PathInits;
import com.mysema.query.types.path.SetPath;
import com.mysema.query.types.path.SimplePath;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Metaname;

/**
 * QMetaname is a Querydsl query type for Metaname
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMetaname extends EntityPathBase<Metaname> {

	public static final QMetaname metaname = new QMetaname("metaname");

	private static final long serialVersionUID = 1021851317L;

	public final NumberPath<Integer> metaNameId = createNumber("metaNameId",
			Integer.class);

	public final StringPath metaNameName = createString("metaNameName");

	public final SetPath<Object, SimplePath<Object>> metas = this
			.<Object, SimplePath<Object>> createSet("metas", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	/**
	 * Constructor for QMetaname.
	 * 
	 * @param path
	 *            Path<? extends Metaname>
	 */
	public QMetaname(Path<? extends Metaname> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QMetaname.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QMetaname(PathMetadata<?> metadata) {
		super(Metaname.class, metadata);
	}

	/**
	 * Constructor for QMetaname.
	 * 
	 * @param variable
	 *            String
	 */
	public QMetaname(String variable) {
		super(Metaname.class, forVariable(variable));
	}

}
