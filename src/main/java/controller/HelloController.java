package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import service.MessageService;

@Component
public class HelloController 
{
	
	private final MessageService messageService;
	
	@Autowired
	public HelloController(@Qualifier("textService")MessageService messageService)
	{
		this.messageService = messageService;
	}
	
	public void sayHello()
	{
		messageService.sendMessage("Hello");
	}
}
