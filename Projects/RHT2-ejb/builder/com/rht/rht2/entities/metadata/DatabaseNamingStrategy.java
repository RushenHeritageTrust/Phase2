package com.rht.rht2.entities.metadata;

import com.mysema.query.codegen.EntityType;
import com.mysema.query.sql.codegen.DefaultNamingStrategy;

public class DatabaseNamingStrategy extends DefaultNamingStrategy {

	@Override
	public String getPropertyName(String columnName, EntityType entityType) {

		// if ("Business_Address".equalsIgnoreCase(columnName)) {
		// return columnName;
		// }
		return super.getPropertyName(columnName, entityType);
	}

	@Override
	public String normalizePropertyName(String columnName) {
		String columnName2 = columnName.replace(" ", "").replace("/", "")
				.replace(".", "");
		return super.normalizePropertyName(columnName2);
	}

}
