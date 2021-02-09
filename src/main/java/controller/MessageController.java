package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import service.EmailService;
import service.MessageService;

@Component
public class MessageController 
{
	@Autowired
	private MessageService messageService ;
	
	//@Autowired
	//public void setMessageService(MessageService messageService)
	//{
	//	this.messageService = messageService;
	//}
	@Autowired
	public MessageController(MessageService messageService)
	{
		this.messageService = messageService;
	}
	
	
	public void send()
	{
		messageService.sendMessage("hello, I am good.");
	}
}
