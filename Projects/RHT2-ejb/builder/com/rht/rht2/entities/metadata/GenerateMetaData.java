package com.rht.rht2.entities.metadata;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mysema.query.codegen.BeanSerializer;
import com.mysema.query.codegen.GenericExporter;
import com.mysema.query.codegen.Keywords;
import com.mysema.query.sql.Configuration;
import com.mysema.query.sql.MySQLTemplates;
import com.mysema.query.sql.codegen.MetaDataExporter;
import com.rht.r2.globalapi.entities.Accountstatus;

public class GenerateMetaData {

	// private static final String APP_SERVER = "app_server";
	private static final String DB_USER = "rht";

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/rht_p1";

	private static final String PACKAGE_NAME = "com.rht.rht2.entities.toq";
	private static final String TARGET_FOLDER = "test";
	private static final String BEAN_PACKAGE_NAME = "com.rht.rht2.entities.to";
	private static final String SCHEMA_PATTERN = "dbo";

	private Connection connection;

	@BeforeClass
	public static void loadDriver() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	@Before
	public void setupConnection() throws SQLException {
		connection = DriverManager.getConnection(DATABASE_URL, DB_USER, "rht");
	}

	@Test
	public void testExport() throws SQLException {

		MetaDataExporter exporter = new MetaDataExporter();
		exporter.setPackageName(PACKAGE_NAME);
		exporter.setTargetFolder(new File(TARGET_FOLDER));
		exporter.setBeanPackageName(BEAN_PACKAGE_NAME);
		exporter.setSchemaPattern(SCHEMA_PATTERN);
		// Turned off to stop gwt-validation from processing
		exporter.setValidationAnnotations(false);
		exporter.setBeanSerializer(new BeanSerializer());
		exporter.setNamingStrategy(new TONamingStrategy());
		exporter.setConfiguration(new Configuration(new MySQLTemplates()));
		exporter.export(connection.getMetaData());

		GenericExporter gexporter = new GenericExporter();
		gexporter.setKeywords(Keywords.JPA);
		gexporter.setEntityAnnotation(Entity.class);
		gexporter.setEmbeddableAnnotation(Embeddable.class);
		gexporter.setEmbeddedAnnotation(Embedded.class);
		gexporter.setSupertypeAnnotation(MappedSuperclass.class);
		gexporter.setSkipAnnotation(Transient.class);
		gexporter.setTargetFolder(new File(TARGET_FOLDER));
		gexporter.setPackageSuffix(".q");
		gexporter.export(Accountstatus.class.getPackage());
	}

	// private void execute(List<String> expected, String genericExporterFolder,
	// String aptFolder) throws IOException {
	// List<String> failures = new ArrayList<String>();
	// int successes = 0;
	// for (File file : new
	// File("target/"+genericExporterFolder+"/com/mysema/query/domain").listFiles())
	// {
	// File other = new File("target/"+aptFolder+"/com/mysema/query/domain",
	// file.getName());
	// if (!other.exists() || !other.isFile()) continue;
	// String result1 = Files.toString(file, Charsets.UTF_8);
	// String result2 = Files.toString(other, Charsets.UTF_8);
	// if (!result1.equals(result2)) {
	// if (!expected.contains(file.getName())) {
	// System.err.println(file.getName());
	// failures.add(file.getName());
	// }
	// } else {
	// successes++;
	// }
	// }
	// if (!failures.isEmpty()) {
	// fail("Failed with " + failures.size() + " failures, " + successes +
	// " succeeded");
	// }
	// }

}
