package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.MessageController;
import service.EmailService;
import service.MessageService;

@Configuration
public class MessageConfiguration 
{
	@Bean
	public MessageController messageController()
	{
		return new MessageController();
	}
	
	@Bean
	public MessageService messageService()
	{
		return new EmailService();
	}
}
