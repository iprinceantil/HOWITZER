package com.qa.poc;

import org.testng.annotations.Test;

import com.google.cloud.spanner.DatabaseClient;
import com.google.cloud.spanner.DatabaseId;
import com.google.cloud.spanner.ResultSet;
import com.google.cloud.spanner.Spanner;
import com.google.cloud.spanner.SpannerOptions;
import com.google.cloud.spanner.Statement;
import com.qa.testBase.TestBase;

public class PocSpannerConnectTest extends TestBase{

	/* 
	 * Google documentation for reference : <https://cloud.google.com/spanner/docs/reference/libraries#windows>
	 * 
	 * Do not forget to add GOOGLE APPLICATION_CERTFICATE to environment variables.
	 * 
	 * <dependency>
		    <groupId>com.google.cloud</groupId>
		    <artifactId>google-cloud-spanner</artifactId>
		    <version>6.21.2</version>
		</dependency>
	 * 
	 * */
	
	final String SPANNER_PROJECT_ID = super.propManager.getPropertyValue("spannerProjectId");
	final String SPANNER_INSTANCE_ID = super.propManager.getPropertyValue("spannnerInstaceId");
	final String SPANNER_DATABASE_ID = super.propManager.getPropertyValue("spannerDataBaseId");
	
	final String TEST_QUERY = "< YOUR SELECT QUERY GOES HERE >";

	@Test
	public void LaunchTest() {

		// Instantiates a client
		SpannerOptions options = SpannerOptions.newBuilder().setProjectId(SPANNER_PROJECT_ID).build();
		Spanner spanner = options.getService();

		try {
			// Creates a database client
			DatabaseClient dbClient = spanner.getDatabaseClient(DatabaseId.of(options.getProjectId(), SPANNER_INSTANCE_ID, SPANNER_DATABASE_ID));

			// Queries the database
			ResultSet resultSet = dbClient.singleUse().executeQuery(Statement.of(TEST_QUERY));

			System.out.println("\n\nResults:");
			// Prints the results
			while (resultSet.next()) {
				System.out.printf("%d\n\n", resultSet.getString(1));
			}
		} finally {
			// Closes the client which will free up the resources used
			spanner.close();
		}

	}

}