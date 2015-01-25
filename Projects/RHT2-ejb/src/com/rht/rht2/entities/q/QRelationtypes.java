package com.rht.rht2.entities.q;

import static com.mysema.query.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.mysema.query.types.Path;
import com.mysema.query.types.PathMetadata;
import com.mysema.query.types.path.EntityPathBase;
import com.mysema.query.types.path.NumberPath;
import com.mysema.query.types.path.StringPath;
import com.rht.rht2.entities.Relationtypes;

/**
 * QRelationtypes is a Querydsl query type for Relationtypes
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QRelationtypes extends EntityPathBase<Relationtypes> {

	public static final QRelationtypes relationtypes = new QRelationtypes(
			"relationtypes");

	private static final long serialVersionUID = 678931064L;

	public final NumberPath<Integer> relationTypesId = createNumber(
			"relationTypesId", Integer.class);

	public final StringPath relationTypesLabel = createString("relationTypesLabel");

	/**
	 * Constructor for QRelationtypes.
	 * 
	 * @param path
	 *            Path<? extends Relationtypes>
	 */
	public QRelationtypes(Path<? extends Relationtypes> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QRelationtypes.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QRelationtypes(PathMetadata<?> metadata) {
		super(Relationtypes.class, metadata);
	}

	/**
	 * Constructor for QRelationtypes.
	 * 
	 * @param variable
	 *            String
	 */
	public QRelationtypes(String variable) {
		super(Relationtypes.class, forVariable(variable));
	}

}
