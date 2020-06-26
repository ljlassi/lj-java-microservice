package ljtmi.microservice;

import java.sql.*;

public class DBConnection {

	private Connection con;
	
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
