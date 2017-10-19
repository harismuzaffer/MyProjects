package com.useit;

import java.io.Serializable;

public class LoginBean implements Serializable {

	private String uname;
	private String pwd;
	private int age;
	public LoginBean() {
		super();
	}
	
	public LoginBean(String uname, String pwd, int age) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.age = age;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
