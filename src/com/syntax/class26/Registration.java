package com.syntax.class26;

public class Registration {
	private String email;
	private String userName;
	private String password;

	public void setEmail(String email) {
		if (!email.isEmpty() && email.contains("yahoo")) {
			this.email = email;
		} else {
			System.out.println("can not access email");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setuserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("username is not valid");
		}
	}

	public String getuserName() {
		return userName;
	}

	public void setpassword(String password) {
		if (!password.contains(userName)) {
			this.password = password;
		} else {
			System.out.println(" no access to password");
		}
	}

	public String getPassword() {
		return password;
	}

}
