package com.rht.rht2.entities.metadata;

import com.mysema.query.sql.codegen.DefaultNamingStrategy;

public class TONamingStrategy extends DefaultNamingStrategy {

	@Override
	public String normalizeTableName(String tableName) {
		String tableName2 = tableName = tableName + "TO";
		return super.normalizeTableName(tableName2);
	}

	@Override
	public String getClassName(String tableName) {

		String tableName2 = tableName = tableName;
		return super.getClassName(tableName2);
	}

}
