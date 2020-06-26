package ljtmi.microservice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class Config implements ConfigInterface {
	
	String config_file_name = "config.properties";
	InputStream input_stream;
	String db_host = "";
	String db_name = "";
	String db_user = "";
	String db_password = "";
	
	@SuppressWarnings("finally")
	public int readConfigFile() throws IOException {
		String db_credentials = "";
		Properties prop = new Properties();
		
		try {
			input_stream = getClass().getClassLoader().getResourceAsStream(config_file_name);
			if (input_stream != null) {
				prop.load(input_stream);
			}
			else {
				throw new FileNotFoundException("property file '" + config_file_name + "' not found in the classpath");
			}
			
			Date time = new Date(System.currentTimeMillis());
			
			this.db_host = prop.getProperty("dbhost");
			this.db_name = prop.getProperty("dbname");
			this.db_user = prop.getProperty("dbuser");
			this.db_password = prop.getProperty("dbpassword");
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			input_stream.close();
			return 0;
		}
	}
	
	public String getDBHost() {
		return this.db_host;
	}
	
	public String getDBName() {
		return this.db_name;
	}
	
	public String getDBUser() {
		return this.db_user;
	}
	
	public String getDBPassword() {
		return this.db_password;
	}
	
}