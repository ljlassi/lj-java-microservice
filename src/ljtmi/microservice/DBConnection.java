package ljtmi.microservice;

import java.sql.*;

/**
 * 
 * @author lassi
 *
 *Purpose of this class is to establish a database connection, save the connection
 * object as a class member can then retrieve the object with the getter for further use.
 *
 */

public class DBConnection {

	// Connection object
	private Connection con;
	
	/**
	 * 
	 * @param config
	 * @return integer
	 */
	
	public int ConnectToDB(ConfigInterface config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mysql://" + config.getDBHost()
			+ "/" + config.getDBName(), config.getDBUser(), config.getDBPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	public Connection getDBObject() {
		return this.con;
	}
	
	public int runInsertQuery(String query) {
		try {
			Statement stmt = this.con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return 0;
	}
}
