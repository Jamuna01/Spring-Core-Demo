package controller;

import org.springframework.beans.factory.annotation.Autowired;

import service.EmailService;
import service.MessageService;

public class MessageController 
{
	private MessageService messageService ;
	
	@Autowired
	public void setMessageService(MessageService messageService)
	{
		this.messageService = messageService;
	}
	
	public void send()
	{
		messageService.sendMessage("hello, I am good.");
	}
}
