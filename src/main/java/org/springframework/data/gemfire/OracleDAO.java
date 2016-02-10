package org.springframework.data.gemfire;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Security;

public class OracleDAO {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@10.105.66.200:1521:DBDEV";
	private static final String DB_USER = "TPA_APP";
	private static final String DB_PASSWORD = "TPA_APP";

	public static void insertSecurity(List<Security> newEntries) {

		try {

			insertRecordIntoTable((ArrayList<Security>)newEntries);

		} catch (SQLException e) {

			String filename= "SQLlogfiles.txt";
		    FileWriter fw;
			try {
				fw = new FileWriter(filename,true);
				fw.write("\n"+e.getMessage());
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} //the true will append the new data
		   

		}

	}

	private static void insertRecordIntoTable(ArrayList<Security> securities) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO Security"
				+ "(sec_code,sec_desc,isin_code,sector_id,sec_type_id,currency_id,location_id,rating_id,ID_SEC) VALUES"
				+ "(?,?,?,?,?,?,?,?,?)";

		try {
			dbConnection = getDBConnection();
			
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
			for (Security security : securities)
			{
			preparedStatement.setString(1, security.getSec_code());
			preparedStatement.setString(2, security.getSec_desc());
			preparedStatement.setString(3, security.getIsin_code());
			preparedStatement.setString(4, security.getSector_id());
			preparedStatement.setInt(5, security.getSec_type_id());
			preparedStatement.setInt(6, security.getCurrency_id());
			preparedStatement.setInt(7, security.getLocation_id());
			preparedStatement.setInt(8, security.getRating_id());
			preparedStatement.setString(9, security.getId());
			System.out.println(security);
			// execute insert SQL stetement
			preparedStatement.addBatch();
		}
			preparedStatement.executeBatch();
			dbConnection.commit();
			System.out.println("Record is inserted into DBUSER table!");

		} catch (SQLException e) {

			throw e;

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

	public static void updateSecurity(ArrayList<Security> securitys) {
		
		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
//sec_code,sec_desc,isin_code,sector_id,sec_type_id,currency_id,location_id,rating_id,Id
		String updateTableSQL = "UPDATE Security"
				+ " SET sec_code=?,sec_desc=?,isin_code=?,sector_id=?,sec_type_id=?,currency_id=?,location_id=?,rating_id=?"
				+ " WHERE ID_SEC =?";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(updateTableSQL);
			for (Security security : securitys) {
			
			
			preparedStatement.setString(1, security.getSec_code());
			preparedStatement.setString(2, security.getSec_desc());
			preparedStatement.setString(3, security.getIsin_code());
			preparedStatement.setString(4, security.getSector_id());
			preparedStatement.setInt(5, security.getSec_type_id());
			preparedStatement.setInt(6, security.getCurrency_id());
			preparedStatement.setInt(7, security.getLocation_id());
			preparedStatement.setInt(8, security.getRating_id());
			preparedStatement.setString(9, security.getId());
			
			System.out.println(updateTableSQL);
			
			// execute update SQL stetement
			preparedStatement.addBatch();
}
			preparedStatement.executeBatch();
			dbConnection.commit();
			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		
		
	}

}