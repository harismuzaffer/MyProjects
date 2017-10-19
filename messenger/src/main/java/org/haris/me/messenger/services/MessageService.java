package org.haris.me.messenger.services;

import java.util.ArrayList;
import java.util.List;

import org.haris.me.messenger.models.Message;

public class MessageService {

	public List<Message> getMessages(){
		
		Message m1= new Message(1, "Hello World", "Haris");
		Message m2= new Message(2, "Hello Java", "Haris");
		Message m3= new Message(3, "Hello Jersey", "Kaoshur");
		List<Message> l= new ArrayList<>();
		l.add(m1);
		l.add(m2);
		l.add(m3);
		return l;
	}
	
}
