package ljtmi.microservice;

public class User {
	  private int id = 0;
	  private String username = "";
	  private String password_hash = "";
	  private String auth_key = "";
	  private String email = "";
	  private String phone = "";

	  public void setId(int id) {
	    this.id = id;
	  }

	  public void setUserName(String username) {
	    this.username = username;
	  }

	  public void setPassWordHash(String password_hash) {
	    this.password_hash = password_hash;
	  }

	  public void setAuthKey(String auth_key) {
	    this.auth_key = auth_key;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public void setPhone(String phone) {
	    this.phone = phone;
	  }

	  public int getId() {
	    return this.id;
	  }

	  public String getUserName() {
	    return this.username;
	  }

	  public String getPasswordHash() {
	    return this.password_hash;
	  }

	  public String getAuthKey() {
	    return this.auth_key;
	  }

	  public String getEmail() {
	    return this.email;
	  }

	  public String getPhone() {
	    return this.phone;
	  }
}
