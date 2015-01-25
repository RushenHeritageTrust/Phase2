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
import com.rht.rht2.entities.Location;

/**
 * QLocation is a Querydsl query type for Location
 * 
 * @author Rob
 * @version $Revision: 1.0 $
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLocation extends EntityPathBase<Location> {

	public static final QLocation location = new QLocation("location");

	private static final long serialVersionUID = -922365862L;

	public final SetPath<Object, SimplePath<Object>> assetses = this
			.<Object, SimplePath<Object>> createSet("assetses", Object.class,
					SimplePath.class, PathInits.DIRECT2);

	public final NumberPath<Integer> locationId = createNumber("locationId",
			Integer.class);

	public final StringPath locationLabel = createString("locationLabel");

	public final NumberPath<Float> locationLat = createNumber("locationLat",
			Float.class);

	public final NumberPath<Float> locationLong = createNumber("locationLong",
			Float.class);

	public final StringPath locationPostcode = createString("locationPostcode");

	/**
	 * Constructor for QLocation.
	 * 
	 * @param path
	 *            Path<? extends Location>
	 */
	public QLocation(Path<? extends Location> path) {
		super(path.getType(), path.getMetadata());
	}

	/**
	 * Constructor for QLocation.
	 * 
	 * @param metadata
	 *            PathMetadata<?>
	 */
	public QLocation(PathMetadata<?> metadata) {
		super(Location.class, metadata);
	}

	/**
	 * Constructor for QLocation.
	 * 
	 * @param variable
	 *            String
	 */
	public QLocation(String variable) {
		super(Location.class, forVariable(variable));
	}

}
