package ljtmi.microservice;

/**
 * 
 * @author lassi
 *
 * Interface for UserController class
 */

public class UserController implements UserControllerInterface {
	
	public int saveUserToDB(User user, DBConnection con) {
		int result = con.runInsertQuery("INSERT INTO user (username, password_hash, latest_auth_key, email, phone)"
				+ "VALUES ('" + user.getUserName() + "', '" + user.getPasswordHash() + "', '" + user.getAuthKey() + "', '"
				+ user.getEmail() + "', '" + user.getPhone() + "')");
		if (result == 0) {
			System.out.println("Succesfully saved user to database");
		}
		return 0;
	}
	
	public User getUserFromDB() {
		User user = new User();
		return user;
	}

}