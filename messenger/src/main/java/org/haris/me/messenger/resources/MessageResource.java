package org.haris.me.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.haris.me.messenger.models.Message;
import org.haris.me.messenger.services.MessageService;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getAllMessages(){
		
		MessageService mr= new MessageService();
		return  mr.getMessages();
	}

}
