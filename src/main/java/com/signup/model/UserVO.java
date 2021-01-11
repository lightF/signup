package com.signup.model;

public class UserVO {
	String uid;
	String name;
	String pwd;
	String email;
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserVO [uid=" + uid + ", name=" + name + ", pwd=" + pwd + ", email=" + email
				+ "]";
	}
	
	
	
	
	
	


}
