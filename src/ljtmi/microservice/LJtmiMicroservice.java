package ljtmi.microservice;

import java.io.IOException;

public class LJtmiMicroservice {
  public static void main(String[] args) throws IOException {
	  
	  /**
	   * Purpose of main at this point is to test that everything works
	   */
	  
	    System.out.println("Testing model.");
			int id = 1;
			String username = "Person1";
			String password_hash = "dfds5443523423423";
			String auth_key = "dfds5443523423423";
			String email = "example@example.com";
			String phone = "+35854376943";
			User user = new User();
			user.setId(id);
			user.setUserName(username);
			user.setPassWordHash(password_hash);
			user.setAuthKey(auth_key);
			user.setEmail(email);
			user.setPhone(phone);
			
			System.out.println(user.getId());
			System.out.println(user.getUserName());
			System.out.println(user.getPasswordHash());
			System.out.println(user.getAuthKey());
			System.out.println(user.getEmail());
			System.out.println(user.getPhone());
			
			Config config = new Config();
			config.readConfigFile();
			System.out.println(config.getDBHost());
			System.out.println(config.getDBName());
			System.out.println(config.getDBUser());
			System.out.println(config.getDBPassword());
			
			DBConnection con = new DBConnection();
			con.ConnectToDB(config);
			UserController user_controller = new UserController();
			user_controller.saveUserToDB(user, con);
			
			MyServer my_server = new MyServer(config.getServerPort());
			try {
				if (my_server.startServer() == 0) {
					System.out.println("Succesfylly started a Jetty server connection.");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		  }
}
