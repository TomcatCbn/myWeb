package com.myweb.po;

public class User {
	private String username;
	private String sex;
	private String hobby;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", sex=" + sex + ", hobby=" + hobby + "]";
	}
	
	
}
