package com.ibm;

public class First {

	private String msg;
	
	public void init(){
		System.out.println("init called");
	}
	
	public First() {
	}
	
	public First(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void welcome(){
		
		System.out.println(msg);
	}
	
}
