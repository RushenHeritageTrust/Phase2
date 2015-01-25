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
import com.rht.rht2.entities.Accountstatus;

/**
 * QAccountstatus is a Querydsl query type for Accountstatus
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAccountstatus extends EntityPathBase<Accountstatus> {

	public static final QAccountstatus accountstatus = new QAccountstatus(
			"accountstatus");

	private static final long serialVersionUID = 251769562L;

	public final NumberPath<Integer> accountStatusId = createNumber(
			"accountStatusId", Integer.class);

	public final StringPath status = createString("status");

	public final SetPath<Object, SimplePath<Object>> userses = this
			.<Object, SimplePath<Object>> createSet("userses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	/**
	 * Constructor for QAccountstatus.
	 * 
	 * @param path
	 *            Path<? extends Accountstatus>
	 */
	public QAccountstatus(Path<? extends Accountstatus> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QAccountstatus.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QAccountstatus(PathMetadata<?> metadata) {
		super(Accountstatus.class, metadata);
	}

	/**
	 * Constructor for QAccountstatus.
	 * 
	 * @param variable
	 *            String
	 */
	public QAccountstatus(String variable) {
		super(Accountstatus.class, forVariable(variable));
	}

}
