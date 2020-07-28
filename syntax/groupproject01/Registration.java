package syntax.groupproject01;

public class Registration {

	private String email, userName, password;

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email = email;
		}
	}
	public void setUserName(String userName) {
		this.userName=userName;
	}
	
	public void setPassword(String password) {
		if(password.isEmpty() && password.length()>6 && !(password.contains(this.userName))) {
			this.password=password;
		}
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}

}
