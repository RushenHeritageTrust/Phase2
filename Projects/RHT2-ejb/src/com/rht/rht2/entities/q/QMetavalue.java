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
import com.rht.rht2.entities.Metavalue;

/**
 * QMetavalue is a Querydsl query type for Metavalue
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QMetavalue extends EntityPathBase<Metavalue> {

	public static final QMetavalue metavalue = new QMetavalue("metavalue");

	private static final long serialVersionUID = 1620007559L;

	public final SetPath<Object, SimplePath<Object>> metas = this
			.<Object, SimplePath<Object>> createSet("metas", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final NumberPath<Integer> metaValueId = createNumber("metaValueId",
			Integer.class);

	public final StringPath metaValueName = createString("metaValueName");

	/**
	 * Constructor for QMetavalue.
	 * 
	 * @param path
	 *            Path<? extends Metavalue>
	 */
	public QMetavalue(Path<? extends Metavalue> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QMetavalue.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QMetavalue(PathMetadata<?> metadata) {
		super(Metavalue.class, metadata);
	}

	/**
	 * Constructor for QMetavalue.
	 * 
	 * @param variable
	 *            String
	 */
	public QMetavalue(String variable) {
		super(Metavalue.class, forVariable(variable));
	}

}
