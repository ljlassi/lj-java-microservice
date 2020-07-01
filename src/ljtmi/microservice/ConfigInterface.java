package ljtmi.microservice;

import java.io.IOException;

/**
 * 
 * @author lassi
 *
 * interface for Config class
 */

public interface ConfigInterface {
	
	public int readConfigFile() throws IOException;
	public String getDBHost();
	public String getDBName();
	public String getDBUser();
	public String getDBPassword();
	public String getServerPort();
}
