package com.haris;

public class Engine {

	private int cc;
	private String type;
	
	public Engine() {
		
	}
	
	public void init(){
		System.out.println("init run");
	}
	
	public Engine(int cc, String type) {
		this.cc = cc;
		this.type = type;
	}

	public int getCc() {
		return cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
}
