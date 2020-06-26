package ljtmi.microservice;

import java.io.IOException;

public interface ConfigInterface {
	
	public int readConfigFile() throws IOException;
	public String getDBHost();
	public String getDBName();
	public String getDBUser();
	public String getDBPassword();
}
