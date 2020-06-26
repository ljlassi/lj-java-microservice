package ljtmi.microservice;

/**
 * 
 * @author lassi
 * 
 * Interface for DBConnection class
 *
 */

public interface DBConnectionInterface {

	public int ConnectToDB();
	
	public int getDBOBject();
	
	public int runInsertQuery(String query);
}
