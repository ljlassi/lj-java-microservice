package ljtmi.microservice;

import java.sql.*;

/**
 * 
 * @author lassi
 *
 *Purpose of this class is to establish a database connection, save the connection
 * object as a class member can then retrieve the object with the getter for further use.
 * This is simply for obtaining the connection object, idea is not to expand this class.
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
			Class.forName("com.myql.jbbc.Driver");
			this.con = DriverManager.getConnection("jbcd:mysql://" + config.getDBHost()
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
}
