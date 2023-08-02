package dev.grafity.springmvc.model;

public class User {
	private String username;
	private String pwd;
	private String mobile;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + ", mobile=" + mobile + "]";
	}
	
}
