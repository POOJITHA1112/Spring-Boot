package com.login;

public class LoginPage {
	
	private String fullname;
	private String username;
	private String password;
	
	public LoginPage() {
	}

	public LoginPage(String fullname, String email, String password) {
		super();
		this.fullname = fullname;
		this.username = email;
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return username;
	}

	public void setEmail(String email) {
		this.username = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginPage [fullname=" + fullname + ", email=" + username + ", password=" + password + "]";
	}
	
	
	

}
