package org.haris.me.messenger.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	private int sno;
	private String message;
	private String author;
	
	
	public Message() {
	}
	
	public Message(int sno, String message, String author) {
		this.sno = sno;
		this.message = message;
		this.author = author;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
