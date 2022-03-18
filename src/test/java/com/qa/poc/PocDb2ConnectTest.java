package com.qa.poc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;


public class PocDb2ConnectTest extends TestBase {

	final String DB2_HOSTNAME = super.propManager.getPropertyValue("rdsHostName");
	final String DB2_PORT = super.propManager.getPropertyValue("rdsPortNo");
	final String DB2_DATABASE = super.propManager.getPropertyValue("rdsDataBase");
	final String DB2_USERNAME = super.propManager.getPropertyValue("rdsUserName");
	final String DB2_PASSWORD = super.propManager.getPropertyValue("rdsPassword");

	final static String QUERY_STATEMENT = "< YOUR SELECT QUERY GOES HERE >";

	@Test
	public void LaunchTest() throws SQLException {

		ConnectToDB2(DB2_HOSTNAME, DB2_PORT, DB2_DATABASE, DB2_USERNAME, DB2_PASSWORD, QUERY_STATEMENT);
	}

	private void ConnectToDB2(String db2HostName, String db2Port, String db2Database, String db2UserName, String db2Password, String queryStatement) {

		String db2ConnectionUri = "jdbc:db2://"+db2HostName+":"+db2Port+"/"+db2Database;

		ResultSet rs = null;

		//System.out.println("DB Connection Init");

		try {
			// Load the driver
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			//System.out.println("**** Loaded the JDBC driver");

			// Create the connection using the IBM Data Server Driver for JDBC and SQLJ
			Connection connection = DriverManager.getConnection(db2ConnectionUri, db2UserName, db2Password);

			// Commit changes manually
			connection.setAutoCommit(false);
			//System.out.println("**** Created a JDBC connection to the data source");

			// Create the Statement
			Statement stmt = connection.createStatement();                                           
			//System.out.println("**** Created JDBC Statement object");

			// Execute a query and generate a ResultSet instance
			rs = stmt.executeQuery(queryStatement);                   
			//System.out.println("**** Created JDBC ResultSet object");

			// Print all of the employee numbers to standard output device
			while (rs.next()) {
				//System.out.println();
				System.out.println("Total records = " + rs.getString(1));
				//System.out.println();
			}
			//System.out.println("**** Fetched all rows from JDBC ResultSet");

			// Close the ResultSet
			rs.close();
			//System.out.println("**** Closed JDBC ResultSet");

			// Close the Statement
			stmt.close();
			//System.out.println("**** Closed JDBC Statement");

			// Connection must be on a unit-of-work boundary to allow close
			connection.commit();
			//System.out.println ( "**** Transaction committed" );

			// Close the connection
			connection.close();                                                            
			//System.out.println("**** Disconnected from data source");

			//System.out.println("**** JDBC Exit from class EzJava - no errors");

		}catch (ClassNotFoundException e)
		{
			System.err.println("Could not load JDBC driver");
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}

		catch(SQLException ex)                                                     
		{
			System.err.println("SQLException information");
			while(ex!=null) {
				System.err.println ("Error msg: " + ex.getMessage());
				System.err.println ("SQLSTATE: " + ex.getSQLState());
				System.err.println ("Error code: " + ex.getErrorCode());
				ex.printStackTrace();
				ex = ex.getNextException(); // For drivers that support chained exceptions
			}
		}
	}
}
