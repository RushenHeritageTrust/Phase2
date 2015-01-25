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
import com.rht.rht2.entities.Assetstatus;

/**
 * QAssetstatus is a Querydsl query type for Assetstatus
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAssetstatus extends EntityPathBase<Assetstatus> {

	public static final QAssetstatus assetstatus = new QAssetstatus(
			"assetstatus");

	private static final long serialVersionUID = -1677617123L;

	public final SetPath<Object, SimplePath<Object>> assetses = this
			.<Object, SimplePath<Object>> createSet("assetses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final StringPath assetStatusDescription = createString("assetStatusDescription");

	public final NumberPath<Integer> assetStatusId = createNumber(
			"assetStatusId", Integer.class);

	/**
	 * Constructor for QAssetstatus.
	 * 
	 * @param path
	 *            Path<? extends Assetstatus>
	 */
	public QAssetstatus(Path<? extends Assetstatus> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QAssetstatus.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QAssetstatus(PathMetadata<?> metadata) {
		super(Assetstatus.class, metadata);
	}

	/**
	 * Constructor for QAssetstatus.
	 * 
	 * @param variable
	 *            String
	 */
	public QAssetstatus(String variable) {
		super(Assetstatus.class, forVariable(variable));
	}

}
