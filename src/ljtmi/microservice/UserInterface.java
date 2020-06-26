package ljtmi.microservice;

/**
 * 
 * @author lassi
 * 
 * Interface for User classs
 *
 */

public interface UserInterface {

	  public void setId(int id);
	  public void setUserName(String username);
	  public void setPassWordHash(String password_hash);
	  public void setAuthKey(String auth_key);
	  public void setEmail(String email);
	  public void setPhone(String phone);

	  public int getId();
	  public String getUserName();
	  public String getPassWordHash();
	  public String getAuthKey();
	  public String getEmail();
	  public String getPhone();
}
