package ljtmi.microservice;

public class LJtmiMicroservice {
  public static void main(String[] args) {
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

		  }
}
