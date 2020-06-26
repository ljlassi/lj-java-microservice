package ljtmi.microservice;

public interface UserControllerInterface {

	int saveUserToDB(User user, DBConnection con);
	User getUserFromDB();
}

